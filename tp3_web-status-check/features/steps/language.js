const { When, Then } = require("@cucumber/cucumber");
const assert = require("assert");

Then("the language should be {string}", function (string) {
  const lang = this.response.data.match(/<html lang="(\w{2})">/)[1];
  assert.strictEqual(lang, string);
});
