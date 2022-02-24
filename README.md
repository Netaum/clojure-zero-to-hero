# CLOJURE - From zero to Hero

## _Or, how can I do the most simple thing in clojure_

As a C# programmer, the perspective of working with a new language, a functional one on top of that, was really challenging.
Functional programming is another way of thinking, and the clojure sintax can be overwhelming in the begining.
So, I thought that a guide, from the very first step, until we deploy a complete API in AWS, could ease the pain and the confusion for the newcommers, like myself.

## Before the storm

Clojure is a functional programming language, with a peculiar sintaxe and different way of thinking code.

Before we try to code something, we need a minimum knowledge of what it is and how to do things.

I'll list here some sources of knowledge that helped me in the begining.

- [Alura]: alghtout the clojure course is somewhat basic, it is very good for someone who never saw anything about clojure.

- [Clojure]: the official link of clojure has everythin we need to code, if you know where to look.

- [Brave Clojure]: maybe the best source of knowledge for the newcommers.

- [Clojure Design Patterns]: a great talk about design patterns in clojure.

## Prepare the training wheels

For this "tutorial", we're gonna use:

- [Clojure]: our shinning and beautiful language

- [Leiningen]: a cli tool to create and manipulate the clojure project (like the "dotnet" cli)

- [VSCode]: the best IDE of our generation :D

- [Calva]: a VS Code plugin for clojure, very mutch like the cursive used on InteliJ

## Check your seat belts

Before we start, lets check if everthing is installed and running.
Open a new terminal, and type:

```sh
clj
```

If the clojure is installed properly, you should see a screen mutch like this:

![terminal with the clojure prompt](/images/tutorial_1.png "clojure repl")

This little thing is one of the most facinating thing in the clojure programming. It's called REPL (Read Eval Print Loop), and allows and interactive environment with clojure. In other words, we can write the code, load it in the REPL, test, change again, load again, test again, and so on. There are some book focused on the REPL programming method (very cool, in my opinion).

Lets check if [Leiningen] is installed. Exit the REPL (``control+c``) and type:

```sh
lein -v
````

If everything is ok, you should see a screen like this one:

![terminal with lein output](/images/tutorial_2.png "lein version output")

That''s it. With [VSCode] installed and [Calva] plugin, we should be able to create a new clojure project without any problem.

## Lets start, shall we

The training will be divided in steps:

- [Step 1] : Creating the project

[//]: #
[Clojure]: <https://clojure.org/index>
[Leiningen]: <https://leiningen.org/>
[VSCode]: <https://code.visualstudio.com/>
[Calva]: <https://marketplace.visualstudio.com/items?itemName=betterthantomorrow.calva>
[Brave Clojure]: <https://www.braveclojure.com/>
[Alura]: <https://cursos.alura.com.br/course/clojure-introducao-a-programacao-funcional>
[Clojure Design Patterns]: <http://mishadoff.com/blog/clojure-design-patterns>

[Step 1]: </docs/step1.md>
