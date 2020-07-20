$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/basic/postWithDataTableFF/PostWithDataTable.feature");
formatter.feature({
  "name": "First Rest Assured test POST",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test my POST request test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user hit the post request with \"Tom\" name",
  "keyword": "Given "
});
formatter.match({
  "location": "com.basic.postWithDataTableSD.MyPostWithDataTable.user_hit_the_post_request_with_json_data(java.lang.String)"
});
formatter.result({
  "error_message": "java.nio.file.NoSuchFileException: D:\\IBM\\workspace\\CucuRestAssured\\src\\test\\java\\com\\basic\\postFromTextFileSD\\user.json\r\n\tat sun.nio.fs.WindowsException.translateToIOException(Unknown Source)\r\n\tat sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source)\r\n\tat sun.nio.fs.WindowsException.rethrowAsIOException(Unknown Source)\r\n\tat sun.nio.fs.WindowsFileSystemProvider.newByteChannel(Unknown Source)\r\n\tat java.nio.file.Files.newByteChannel(Unknown Source)\r\n\tat java.nio.file.Files.newByteChannel(Unknown Source)\r\n\tat java.nio.file.Files.readAllBytes(Unknown Source)\r\n\tat com.basic.postWithDataTableSD.MyPostWithDataTable.user_hit_the_post_request_with_json_data(MyPostWithDataTable.java:36)\r\n\tat ✽.user hit the post request with \"Tom\" name(file:///D:/IBM/workspace/CucumberLatestBuild/src/test/resources/com/basic/postWithDataTableFF/PostWithDataTable.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user validate followind data",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.basic.postWithDataTableSD.MyPostWithDataTable.user_validate_followind_data(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I will validate other parameter",
  "keyword": "Then "
});
formatter.match({
  "location": "com.basic.postWithDataTableSD.MyPostWithDataTable.I_will_validate_other_parameter()"
});
formatter.result({
  "status": "skipped"
});
});