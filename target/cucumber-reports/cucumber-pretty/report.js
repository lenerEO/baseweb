$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Perform term searchs",
  "description": "",
  "id": "perform-term-searchs",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3434468243,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Perform an existing term search",
  "description": "",
  "id": "perform-term-searchs;perform-an-existing-term-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is in main page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User fills out the term \"Microsoft\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "The page shows title \"Microsoft\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.userIsInMainPage()"
});
formatter.result({
  "duration": 2847473511,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Microsoft",
      "offset": 25
    }
  ],
  "location": "Search.userFillsOutTheTerm(String)"
});
formatter.result({
  "duration": 1664107991,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Microsoft",
      "offset": 22
    }
  ],
  "location": "Search.thePageShowsTitle(String)"
});
formatter.result({
  "duration": 71819900,
  "status": "passed"
});
formatter.after({
  "duration": 810926141,
  "status": "passed"
});
formatter.before({
  "duration": 2532582821,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Perform a non existing term search",
  "description": "",
  "id": "perform-term-searchs;perform-a-non-existing-term-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User is in main page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User fills out the term \"EQRWWOW\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The page shows the message \"\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.userIsInMainPage()"
});
formatter.result({
  "duration": 2369052811,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EQRWWOW",
      "offset": 25
    }
  ],
  "location": "Search.userFillsOutTheTerm(String)"
});
formatter.result({
  "duration": 1069999898,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 28
    }
  ],
  "location": "Search.thePageShowsTheMessage(String)"
});
formatter.result({
  "duration": 1141376,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepdefinitions.Search.thePageShowsTheMessage(Search.java:34)\r\n\tat ✽.Then The page shows the message \"\"(Search.feature:10)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 770059410,
  "status": "passed"
});
});