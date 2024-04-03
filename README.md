<h2>Task 1: Write Test Scripts</h2>

Instruction for running the tests
- Install the following JDK 12 and Apache Poi Maven
- Clone this repository "https://github.com/wonderdarna/active-talent-test-automation.git"
- Build the project Build -> Build Project and wait for all the dependencies to be downloaded
- Create a .env file in the root folder and add the below.
  <br>browser=chrome
  <br>url=https://www.saucedemo.com/
  <br>username=standard_user
  <br>password=secret_sauce
- Once the above steps are done run this command : <b>mvn clean test</b>
- Test result is located in this directory **target/cucumber-reports/output/report.html**


<h2>Task 2: Debugging Challenge</h2>
**Objective**
<div>You are provided with a set of automated test scripts that are inconsistently failing (flaky tests). Identify at least
two possible causes for the flakiness and propose solutions to stabilize these tests.</div>

<div><b>Provide your analysis and solutions in a written format.</b></div>
<br>
<div><b>Analysis</b></div>
<div>Possible root causes are :</div>
<ul>
<li>Poor selection of locators</li>
<li>Not reusable test data</li>
<li>Slowness of the application</li>
</ul>

<div><b>Solution for the following items</b></div>
<ul>
<li><b>Poor selection of locators</b> - Most of the modern web applications now don't have a static attribute values now such as Ids, classes etc. To resolve this kind of issues you may use the approach of using Xpath for getting the text of the element, using relative xpath and css locators, use of advance functions of xpath and css selectors</li>
<li><b>Not reusable test data</b> - Most of the time, tests rely on the test data. Some of these test data cannot be reused once already used. The solution for this is to identify all the test cases that have this test data then try automating the creation of these data through api, using faker library of java etc. so your test wont rely on static data </li>
<li><b>Slowness of the application</b> - Sometimes, your tests fail not due to the items mentioned above. Sometimes its due to the application itself. This type of issue should be raised to the development team to fix. For the meantime, to unblock you on testing the functionalities of the app you might want to use Explicit Wait or adjust the maximum timeout of your tests. </li>
</ul>

