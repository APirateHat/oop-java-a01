---
revision:
    "2024-11-25": "(A, mos) First version, refactored from C# and enhanced."
---
Lab 03: Strings, characters and arrays
===========================

In this laboration you get to practice working with strings, characters and arrays. You will also practice to look for and finding built-in methods that will help you write less code.

[[_TOC_]]

<!--
TODO

* Rework this lab to be only strings and chars
* Maybe include numbers
* Move array to next lab?
* Many suggestions of new labs available in the Soltusions file

* Add short hints on useful functions, to make it easier to get going, or link to the manual of strings, chars (numbers)

* Add to Lab how to compare characters

-->


Precondition
---------------------------

You know the basics datatypes string and characters and you know the concept of the array.



Download the lab
---------------------------

Carry out the following steps to download the files needed for the lab. You download the lab files from a repo in GitLab. 

The commands downloads a script and executes it. The script will then download the lab.

<details>
<summary>Download using Windows PowerShell terminal</summary>

```bash
iex (Invoke-WebRequest -Uri "https://gitlab.com/mikael-roos/java/-/raw/main/lab/script/download_lab.ps1" -UseBasicParsing).Content
```

You can also do this in two steps, first download the script and then execute it.

```bash
# Download the script
Invoke-WebRequest -Uri "https://gitlab.com/mikael-roos/java/-/raw/main/lab/script/download_lab.ps1" -OutFile "download_lab.ps1" -UseBasicParsing

# Execute the script
.\download_lab.ps1
```

</details>

<details>
<summary>Download using Bash terminal</summary>

```bash
bash <(curl -Ls https://gitlab.com/mikael-roos/java/-/raw/main/lab/script/download_lab.bash)
```

You will get an error message if you do not have curl installed. Then try this instead.

```bash
bash <(wget -qO- https://gitlab.com/mikael-roos/java/-/raw/main/lab/script/download_lab.bash)
```

</details>

Move into the directory where the lab files are.

```bash
cd lab/lab_03
ls 
```

You can now open your vscode from that directory.

```bash
code .
```

Look around in the files from the lab and try to understand how they connect to each other and what they contain.



Compile and execute the lab
---------------------------

You can compile and execute the lab with the following command.

<details>
<summary>Compile and execute in Windows PowerShell terminal</summary>

If you are on an older version of PowerShell (pre 7), then you need to compile and execute like this.

```bash
javac *.java; java Main
```

On newer versions of PowerShell you can compile all Java files `*.java` and if it is successful execute the main program.

```bash
javac *.java && java Main
```

</details>

<details>
<summary>Compile and execute in Bash terminal</summary>

Compile all Java files `*.java` and if it is successful execute the main program.

```bash
javac *.java && java Main
```

</details>

It can look something like this.

```bash
❌ 1p. hello(), expected: "Hello World!" (java.lang.String), actual: "" (java.lang.String)
❌ 1p. getInteger(), expected: 42 (java.lang.Integer), actual: 0 (java.lang.Integer)
... more output 
 --------------------------------------------------------------------
| Total: 42, Passed ✅: 0, Failed ❌: 42
|
| Points needed to PASS=15, PASS WITH HONOUR=19, TOTAL=21
|  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  ⦾  😁  ⦾  ⦾  ⦾  😍  ⦾  🙌 
|
| You have 0 points. Try to earn 1 point to get started... 😏
 --------------------------------------------------------------------
```

The main program is in `Main.java` and it executes the methods in `Answer.java` using the lab tools in `Lab.java`.

You are supposed to implement the bodies of the methods in `Answer.java`.

<details><summary>Troubleshoot PowerShell: I can not see the emojis!</summary>

**SOLUTION smileys** Enable PowerShell UTF-8 support. If you can not see the UTF-8 characters and smileys, then try to "[Enable UTF-8 support in Windows PowerShell to print emojis from (Java) code](https://gitlab.com/mikael-roos/java/-/issues/1)".

<!--
**HINT 1: smileys** Set the environment variable to ensure the UTF-8 characters are displayed. You only do this once for each terminal you start up.

```powershell
$Env:JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF8"
```
-->

</details>



Get help
---------------------------

You may use any helper tool to get information about how to solve the methods in the lab, but you should always write and own your own code.

Do not plain copy code without understanding what the code does. Its rather a waste of time to work through this lab if you copy someone else solution. Always make the code "your own".
 


Solution
---------------------------

This lab has a solution in [`Solution.java`](https://gitlab.com/mikael-roos/java/-/blob/main/lab/lab_03/Solution.java) which you can review online. Use it as a help and learning tool. Do not simply copy it, that is just a waste of your invested learning time.
