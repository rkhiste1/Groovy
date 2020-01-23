README
====

Meta
----
This README file is in a format known as Markdown.
It is very much like a text file.
However it looks better in a Markdown Editor/Viewer.
If you don't have a markdown editor or are not sure, take a look at this one: [http://markable.in/editor/](http://markable.in/editor/)

The Honor Code
--------------

This is a test for a developer position at Transcend Insights.
By continuing to read this, you agree to the Honor Code (We like reusing questions, and you will not distribute interview questions.)

General instructions
--------------------
1. The code here is written in Groovy. Groovy is very much like Java.
  In fact 99% of java code is perfectly valid and identically running groovy code.
  If you are not familiar with Groovy, just write code as you would with Java.
  There are no penalties for it.

2. Do not rename files. That makes it harder for us to review your code.

3. Do not change the APIs. That makes it harder for us to test your code.


Part 1: Number Picker
---------------------

It isn't alphabetically first, but we suggest you take up this first.
We've done the design and there is some scaffolding in the code that will help you solve the problem.
Carefully read the javadoc of `numberpicker.NumberPicker` and start tackling problems in the order they appear in `TODO` tags.

There are test cases in `numberpicker.NumberPickerTest` that you can run to ensure your code works.

Part 2: Grid Search
-------------------

This is the harder problem: we haven't provided you with the scaffolding.
There's just one `TODO` in `gridsearch.GridSearch` and a bunch of tests in `gridsearch.GridSearchTest`.
You'll have to do your own design and implementation.

Getting familiarized
--------------------
We've built this code using [`gradle`](http://www.gradle.org/).
It's a build tool similar to `ant` and `maven`.
If you're reading this, it means you have successfully untarred the code.

You can use any IDE of your choice: - `vi`, `emacs`, `nano`, `eclipse`, `IntelliJ IDEA`, `Netbeans`.
Gradle has support for configuring eclipse and IntelliJ Idea to work with it.
With anything else, you can always use the command line.

The single most important command you'll use in this exercise is

    ./gradlew test

or on Windows:

    gradlew.bat test

For the remainder of this document, we'll assume you're using POSIX.
However if you're using Windows substitute `./gradlew` with `gradle.bat` and it should work.

Once you run that command you'll see an html file created at

    build/reports/tests/index.html

That will tell you if the tests passed.

Submitting code
---------------
Tell gradle to package your code and submit it to us.

    ./gradlew submitAssignment

It might take a few minutes to finish the submission based on your internet connection speed and the quality of the connection to our server.
Please be patient.

Once it finishes running, it will print a json on your screen, like:

```
± ./gradlew submitAssignment 
:compileJava UP-TO-DATE
:compileGroovy UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
:jar UP-TO-DATE
:sourcesJar UP-TO-DATE
:testJar UP-TO-DATE
:assemble UP-TO-DATE
:submitAssignment
{"identifier":"9 petite sparrows melted evenly"}

BUILD SUCCESSFUL

Total time: 12.317 secs

```

Copy the json, i.e. `{"identifier":"9 petite sparrows melted evenly"}` and email it to the person who sent it to you.

**Do not email the one in this README. Email the one that was printed on your screen.**
