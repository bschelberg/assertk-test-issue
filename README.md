# assertk-test-issue
Small project to demonstrate issue found with assertk.

Question was asked on Stackoverflow here: https://stackoverflow.com/questions/65207428/assertk-test-shouldnt-pass-nested-alls-any

Code contains one test that shouldn't pass because of a copy-paste error that I made. The second assert in the test should fail because the `key` is not equal to `value1`.

Removing the second entry from the map results in a failure, as expected.

This example is somewhat contrived, it's a small sample originally intended to demonstrate a different issue I had, but now I'm curious as to why this test passes when it shouldn't.
