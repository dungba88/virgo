package org.joo.virgo.test;

import java.util.ArrayList;
import java.util.List;

import org.joo.virgo.BusinessRule;
import org.joo.virgo.DefaultBusinessRule;
import org.joo.virgo.model.DefaultExecutionResult;
import org.joo.virgo.model.ExecutionResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestSimple {

	private String value;
	private String name;
	private Object expected;

	public TestSimple(String value, String name, Object expected) {
		this.value = value;
		this.name = name;
		this.expected = expected;
	}
	
	@Test
	public void testSimple() {
		BusinessRule rule = new DefaultBusinessRule(value);
		ExecutionResult result = rule.execute(null).orElse(new DefaultExecutionResult(null));
		if (name == null)
			Assert.assertEquals(value + ":", expected, result.getValue());
		else
			Assert.assertEquals(value + ":", expected, result.getValue(name));
	}
	
	@Parameters
	public static List<Object[]> data() {
		List<Object[]> list = new ArrayList<Object[]>();

		list.add(new Object[] { "IF <<1 + 1 == 2>> THEN SET result = <<1>>; SET result2 = <<2>>", "result", 1L });
		list.add(new Object[] { "IF <<1 + 1 == 2>> THEN SET result = <<1>>; SET result2 = <<2>>", "result2", 2L });
		list.add(new Object[] { "IF <<1 + 1 == 2>> THEN SET result = <<1>>", null, 1L });
		list.add(new Object[] { "IF <<1 + 1 < 2>> THEN SET result = <<1>>", null, null });
		list.add(new Object[] { "IF <<1 + 1 < 2>> THEN SET result = <<1>> ELSE SET result = <<2>>", null, 2L });
		list.add(new Object[] { "SET result = <<true>>", null, true });

		return list;
	}
}
