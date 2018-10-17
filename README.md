# virgo

Virgo is a Java Business Rule Engine, based on Libra. It supports an easy-to-use syntax for defining business rule.

## grammar

These are the supported grammar of Virgo

Single IF condition:
```
IF {condition} THEN {actions}
```

Multiple IF conditions:
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

## examples

The following are valid examples:

```
IF 1 + 1 == 2 THEN SET result = 1

IF customer.age > 50 THEN SET seniorCitizen = true ELSE SET seniorCitizen = false

SET seniorCitizen = customer.age > 50

IF order.price > 100 THEN SET discount = 0.1

```
