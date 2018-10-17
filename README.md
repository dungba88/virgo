# virgo

Virgo is a Java Business Rule Engine, based on Libra. It supports an easy-to-use syntax for defining business rule.

## how to use

```java
// create a business rule
BusinessRule rule = new DefaultBusinessRule("IF customer.age > 50 THEN SET seniorCitizen = true");

// create a rule context
RuleContext context = new RuleContext(someObject);

// execute it
ExecutionResult result = rule.execute(ruleContext).orElseThrow(() -> new NullPointerException("result is null"));

// get the result. this will get the first value in the result map
Object resultValue = result.getValue();

// get a specific result
resultValue = result.getValue("seniorCitizen");
```

## grammar

These are the supported grammar of Virgo

Single condition:
```
IF {condition} THEN {actions}
```

Branched conditions:
```
IF <condition> THEN <actions>
ELSE IF <condition> THEN <actions>
ELSE <actions>
```

Nested conditions:
```
IF <condition> THEN
  IF <condition> THEN
    <actions>
  ELSE
    <actions>
```

Nested conditions with braces:
```
IF <condition> THEN {
  IF <condition> THEN
    <actions>
  ELSE
    <actions>
} ELSE {
    <actions>
}
```

No condition at all:
```
<action>
```

Multiple actions can be separated by semicolons:
```
<action>;
<action>;
```

Currently only assignment action is supported:
```
SET {someVariable} = {someExpression}
```

*Note: The line break is not required, it's just to make it easier to read*

## examples

The following are valid examples:

```
IF 1 + 1 == 2 THEN SET result = 1

IF customer.age > 50 THEN SET seniorCitizen = true ELSE SET seniorCitizen = false

SET seniorCitizen = customer.age > 50

IF order.price > 100 THEN SET discount = 0.1

IF product.brand is 'Apple' THEN SET discount = 0.2 
ELSE IF product.brand is 'Samsung' THEN SET discount = 0.3
ELSE SET discount = 0.1
```
