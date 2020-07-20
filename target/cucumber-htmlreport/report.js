$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:com/basic/compareEntireJson/comparejson.feature");
formatter.feature({
  "name": "compare entire json",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test my Delete request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user compare two json string",
  "keyword": "Given "
});
formatter.match({
  "location": "com.basic.compareEntireJson.TestCompareJson.user_compare_two_json_string()"
});
formatter.result({
  "status": "passed"
});
});