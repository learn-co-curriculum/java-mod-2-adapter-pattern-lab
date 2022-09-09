# Adapter Pattern Lab

## Learning Goals

- Use the adapter pattern

## Instructions

Use the adapter design pattern to update a code base. The code base already has
a `Tree` interface with three implementations:

- `Aspen`
- `Pine`
- `Redwood`

Each of these trees has a height associated with it that is currently measured
in feet.

Using the adapter design pattern, create an adapter class to convert the height
of these trees to be measured in meters instead of feet.

Here are some instructions to help you get started:

- Create a `MeterHeight` adapter interface to help convert the units of feet to
  meters.
- Create a `HeightAdapter` class to use as your adapter class.
- Have the `HeightAdapter` class implement the `MeterHeight` interface.
- Use the conversion: 1 foot = 0.3048 meters.

## Starter Code

Consider the following starter code already available to you:

Tree.java

```java
public interface Tree {
    // Get the height of a tree in feet
    double getHeight();
}
```

Aspen.java

```java
public class Aspen implements Tree {

    @Override
    public double getHeight() {
        // Quaking aspen trees are usually around 20 - 50 feet tall
        return 50;
    }
}
```

Pine.java

```java
public class Pine implements Tree {

    @Override
    public double getHeight() {
        // Eastern white pine trees are usually around 50 - 80 feet tall
        return 80;
    }
}
```

Redwood.java

```java
public class Redwood implements Tree {

    @Override
    public double getHeight() {
        // Redwood trees are usually between 200 - 240 feet tall
        return 240;
    }
}
```

Use the `TreeDriver` class to help test your implementation of the adapter
pattern:

```java
public class TreeDriver {

    public static void main (String[] args) {
        Aspen aspen = new Aspen();
        Pine pine = new Pine();
        Redwood redwood = new Redwood();

        MeterHeight aspenInMeters = new HeightAdapter(aspen);
        System.out.println("The height of an aspen tree in meters is " + aspenInMeters.getHeight());
        MeterHeight pineInMeters = new HeightAdapter(pine);
        System.out.println("The height of an pine tree in meters is " + pineInMeters.getHeight());
        MeterHeight redwoodInMeters = new HeightAdapter(redwood);
        System.out.println("The height of an redwood tree in meters is " + redwoodInMeters.getHeight());
    }
}
```

## Expected Output

Below is the expected output from executing the `TreeDriver` class above:

```plaintext
The height of an aspen tree in meters is 15.24
The height of an pine tree in meters is 24.384
The height of an redwood tree in meters is 73.152
```
