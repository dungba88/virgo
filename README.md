# virgo

Virgo is a Java Business Rule Engine, based on Libra. It supports an easy-to-use syntax for defining business rule.

## how to use

```java
// create a business rule
BusinessRule rule = new DefaultBusinessRule(someRule);

// create a rule context
RuleContext context = new RuleContext(someObject);

// execute it
ExecutionResult result = rule.execute(ruleContext);
```

## grammar

These are the supported grammar of Virgo

Single condition:
```
IF {condition} THEN {actions}
```

Branched conditions:
```
IF {condition} THEN {actions}
ELSE IF {condition} THEN {actions}
ELSE {actions}
```

No condition at all:
```
{actions}
```

Currently only assignment action is supported:
```
SET {someVariable} = {someExpression}
```

You can have multiple actions separated by semicolon:
```
SET {someVariable} = {someExpression};
SET {anotherVariable} = {anotherExpression};
```

*Note: The line break is not required, it's just to make it easier to read*

## examples

The following are valid examples:

```
// Simple
IF 1 + 1 == 2 THEN SET result = 1

IF customer.age > 50 THEN SET seniorCitizen = true ELSE SET seniorCitizen = false

SET seniorCitizen = customer.age > 50

IF order.price > 100 THEN SET discount = 0.1

IF product.brand is 'Apple' THEN SET discount = 0.2 
ELSE IF product.brand is 'Samsung' THEN SET discount = 0.3
ELSE SET discount = 0.1
```
