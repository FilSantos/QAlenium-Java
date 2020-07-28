package br.com.qalenium.tests.unit;

import br.com.qalenium.rules.ClassTestRule;
import br.com.qalenium.rules.MethodTestRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class RulesUnitTests {

    @Mock
    ClassTestRule classTestRule;

    @Mock
    MethodTestRule methodTestRule;

    @Mock
    Statement statement;

    @Mock
    Description description;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void classTestRuleUnitTest() {
        statement = classTestRule.apply(statement, description);
        Assert.assertNull(statement);
    }

    @Test
    public void methodTestRuleUnitTest() {
        statement = methodTestRule.apply(statement, description);
        Assert.assertNull(statement);
    }

}
