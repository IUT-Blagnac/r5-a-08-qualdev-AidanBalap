const { When, Then } = require("@cucumber/cucumber");
const axios = require("axios");
const assert = require("assert");

When("I visit the URL {string}", async function (url) {
  this.response = await axios.get(url);
});

Then("the status should be {string}", function (expectedStatus) {
  assert.strictEqual(this.response.status.toString(), expectedStatus);
});
