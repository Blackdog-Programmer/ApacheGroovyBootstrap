## Q/A on Groovy

## 00. What is Appache Groovy
<p>Apache Groovy is a <strong>powerful, optionally typed</strong> and <strong>dynamic</strong> language, with <strong>static-typing and static compilation</strong> capabilities for the Java platform, aimed at improving developer productivity thanks to a concise, <strong>familiar and easy to learn syntax.</strong> It integrates smoothly with any Java program and immediately delivers to your application powerful features, including scripting capabilities, <strong>Domain-Specific Language</strong> authoring, runtime and compile-time <strong>meta-programming</strong> and <strong>functional</strong> programming.</p>

<kbd>
  <img src="https://github.com/Blackdog-Programmer/ApacheGroovyBootstrap/blob/master/reference/overview/groovy_features.png" alt="Groovy Features">
</kbd>


## 01. References
<ul>
  <li><a href="http://groovy-lang.org/">Groovy.org</a></li>
  <li><a href="http://groovy-lang.org/api.html">Groovy 3.0.1 API</a></li>
  <li><a href="http://groovy-lang.org/gdk.html">Groovy JDK API Documentation</a></li>
  <li><a href="https://groovy-lang.org/style-guide.html">Groovy Style Guide</a></li>
</ul>


## 02. Getting Started
<ul>
  <li><a href="http://groovy-lang.org/groovysh.html">groovysh - the Groovy repl-like shell</a></li>
  <li><a href="http://groovy-lang.org/groovyc.html">groovyc - the Groovy compiler</a></li>
  <li><a href="http://groovy-lang.org/groovyconsole.html">groovyConsole - the Groovy Swing consoler</a></li>
</ul>
    
    
## 04. Groovy Basics
<ul>
  <li><a href="https://groovy-lang.org/syntax.html">Groovy Syntax</a></li>
  <li><a href="http://groovy-lang.org/structure.html#_default_imports">Grrovy Default Imports</a></li>
  <li><a href="http://groovy-lang.org/syntax.html#_keywords">Groovy Keywords</a>
    <ul>
      <li><a href="https://www.baeldung.com/groovy-def-keyword">Def Keyword(dynamic typed)</a></li>
    </ul>
  </li>
  <li><a href="http://groovy-lang.org/syntax.html#_single_line_comment">Groovy Comments</a>
    <ul>
      <li><a href="https://medium.com/@webseanhickey/the-evolution-of-a-software-engineer-db854689243#.5zm1hn71e">The Evolution of a Software Engineer</a></li>
    </ul>
  </li>
  <li><a href="http://groovy-lang.org/semantics.html#_power_assertion">Groovy Power Assertion</a></li>
  <li><a href="http://groovy-lang.org/structure.html#_script_class">Groovy Scripts file is <strong>always compiled to java class file!</strong></a></li>
  <li><a href="http://groovy-lang.org/objectorientation.html#_class">Groovy Classes</a></li>
  <li><a href="http://groovy-lang.org/semantics.html#_control_structures">Groovy Control Structure</a></li>
  <li><a href="http://groovy-lang.org/objectorientation.html#_annotation">Groovy Annotation</a></li>
  <li><a href="http://docs.groovy-lang.org/next/html/gapi/groovy/transform/package-summary.html">Groovy Tranfrom APIs</a>
    <ul>
      <li><a href="https://dzone.com/articles/groovy-ast-transformations">What is Groovy AST(Abstract Syntax Tree)</a></li>
    </ul>
  </li>
  <li><a href="https://groovy-lang.org/operators.html">Groovy Operators</a></li>
  <li><a href="http://docs.groovy-lang.org/latest/html/documentation/grape.html">Dependency management with Grape</a>
    <ul>
      <li><a href="https://commons.apache.org/proper/commons-lang/javadocs/api-release/org/apache/commons/lang3/text/package-summary.html">Package org.apache.commons.lang3.text</a></li>
      <li><a href="https://search.maven.org/">The Central Repository</a></li>
    </ul>
  </li>
</ul>


## 05. Simple Data Types
<ul>
  <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">Java Primitive Data Types</a></li>
  <li><a href="https://groovy-lang.org/objectorientation.html">Groovy Data Types: all primitive datatypes are wrapper class</a></li>
  <li><a href="http://docs.groovy-lang.org/latest/html/documentation/core-semantics.html#_number_promotion">Groovy Number Pormotion</a></li>
  <li><a href="https://groovy-lang.org/operators.html#Operator-Overloading">Groovy Operator Overloading</a></li>
  <li><a href="https://docs.groovy-lang.org/latest/html/documentation/#all-strings">Groovy String Manipulations</a></li>
  <li><a href="https://www.geeksforgeeks.org/write-regular-expressions/">How to write Regular Expressions?</a>
    <ul>
      <li><a href="https://www.regular-expressions.info/groovy.html">Groovy Regular Expressions</a></li>
      <li><a href="https://www.geeksforgeeks.org/regular-expressions-in-java/">Regular Expressions in Java</a></li>
      <li><a href="https://www.geeksforgeeks.org/regular-expression-python-examples-set-1/">Regular Expression in Python</a></li>
    </ul>
  </li>
</ul>


## [O6. Collections](http://docs.groovy-lang.org/next/html/documentation/working-with-collections.html)
<ul>
  <li><a href="http://docs.groovy-lang.org/next/html/documentation/working-with-collections.html#Collections-Ranges">Ranges</a></li>
  <li><a href="http://docs.groovy-lang.org/next/html/documentation/working-with-collections.html#Collections-Lists">Lists</a></li>
  <li><a href="http://docs.groovy-lang.org/next/html/documentation/working-with-collections.html#Collections-Maps">Maps</a></li>
</ul>


## [07. Closures](https://groovy-lang.org/closures.html)
<kbd>
  <img src="https://github.com/Blackdog-Programmer/ApacheGroovyBootstrap/blob/master/reference/Closure/Closure_Overview.png", alt = "Closure Overview">
</kbd><br>
<ul>
  <li><a href="https://groovy-lang.org/closures.html#_syntax">Syntax</a></li>
  <li><a href="https://groovy-lang.org/closures.html#_parameters">Parameters</a></li>
  <li><a href="https://groovy-lang.org/closures.html#_delegation_strategy">Delegation Stretegy</a></li>
  <li><a href="https://groovy-lang.org/closures.html#_closures_in_gstrings">Closure in GStrings</a></li>
  <li><a href="https://groovy-lang.org/closures.html#_closure_coercion">Closure coercion</a></li>
  <li><a href="https://groovy-lang.org/closures.html#_currying">Functional Programming</a></li>
</ul>
<kbd>
  <img src="https://github.com/Blackdog-Programmer/ApacheGroovyBootstrap/blob/master/reference/Closure/Owner_Delegate_This.png" alt="Closure: Scope, Delegate and Strategy">
</kbd>


## 08. Control Structures
<kbd>
  <img src="https://github.com/Blackdog-Programmer/ApacheGroovyBootstrap/blob/master/reference/ControlStrcuture/Groovy_Boolean_Test.png" alt="Groovy Truth Table">
</kbd><br>
<ul>
  <li><a href="http://groovy-lang.org/semantics.html#Groovy-Truth">The Groovy Truth</a></li>
  <li><a href="http://groovy-lang.org/semantics.html#_if_else">if-else</a></li>
  <li><a href="http://groovy-lang.org/semantics.html#_switch_case">switch / case</a></li>
  <li><a href="http://groovy-lang.org/semantics.html#_looping_structures">Looping structures</a></li>
</ul>


## [09. Object Oriented Programming(OOP)](https://groovy-lang.org/objectorientation.html)
<ul>
  <li><a href="https://www.baeldung.com/groovy-traits">An Introduction to Traits in Groovy</a></li>
  <li><a href="https://www.baeldung.com/spring-groovy-beans">Groovy Bean Definitions</a></li>
</ul>

### 09-1. Q&A
<ul>
  <li><a href="https://softwareengineering.stackexchange.com/questions/253124/traits-inheritance-and-interfaces-in-groovy-when-to-use-them">Traits, Inheritance and Interfaces in Groovy, when to use them?</a></li>
</ul>

## [10. Runtime MetaProgramming](https://groovy-lang.org/metaprogramming.html)
<kbd>
  <img src="https://github.com/Blackdog-Programmer/ApacheGroovyBootstrap/blob/master/reference/MetaProgramming/MetaObjectProtocol(MOP).png" alt="MOP Definition">
</kbd>

## [11. Compile Time MetaProgramming](https://www.baeldung.com/groovy-metaprogramming)


## [12. Groovy Sql - Working with Relational Database](https://groovy-lang.org/databases.html)
<ul>
  <li><a href="https://groovy-lang.org/databases.html#_connecting_to_the_database">Connecting to the database</a></li>
  <li><a href="https://groovy-lang.org/databases.html#_executing_sql">Executing SQL</a></li>
  <li><a href="https://groovy-lang.org/databases.html#_basic_crud_operations">Basic CRUD operations</a></li>
  <li><a href="https://groovy-lang.org/databases.html#_advanced_sql_operations">Advanced SQL operations</a></li>
</ul>


## [13. Working with Builders](http://docs.groovy-lang.org/next/html/gapi/groovy/transform/builder/Builder.html)


## [14. Working with REST Services](https://www.baeldung.com/groovy-web-services)


## [15. Working with the GDK](http://docs.groovy-lang.org/docs/next/html/documentation/core-gdk.html)
