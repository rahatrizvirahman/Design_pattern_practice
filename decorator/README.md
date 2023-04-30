## Description
The decorator design pattern is like using a wrapper over a class. If you want to change the behavior of a class in runtime you wrap it by a decorator which can be also wrapped by another decorator …

### Why don't we just use subclass/inheritance?
Suppose we have a component class A. But we want to change the behavior of class A. We can do that by creating a subclass B that extends class A and overwrite the methods of class A. If we again need to change some behavior of class B, we need to create a subclass C that extends class B.
C -> B -> A

Now, if we need the behavior of class C first and then the behavior of class B, then we have to implement another set of inheritance, where class C extends class A and later class B extends class C.
B -> C -> A

On the other hand, if we use a decorator design pattern, we can simply create a decorator for each new behavior, which is a component and has a component. In other words, a decorator is of type class A and has a class A object in it. So, we can create decoratorB that adds the behavior of class B, and create a decoratorC which adds the behavior of class C to class A. Now we can use these two decorators in any order and any number of times as we need. For example, we can wrap class A object with decoratorB and then wrap decoratorB object with decoratorC
decoratorC -> decoratorB -> A

We can also wrap class A object with decoratorC and then wrap decoratorC object with decoratorB.
decoratorB -> decoratorC -> A

We don’t need to create separate subclasses for implementing the behaviors in different order like before.
