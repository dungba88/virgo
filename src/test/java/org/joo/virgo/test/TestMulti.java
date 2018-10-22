package org.joo.virgo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joo.virgo.BusinessRule;
import org.joo.virgo.DefaultBusinessRule;
import org.joo.virgo.MultiBusinessRule;
import org.joo.virgo.model.ExecutionResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestMulti {

	private String[] values;
	private String name;
	private Object expected;

	public TestMulti(String[] values, String name, Object expected) {
		this.values = values;
		this.name = name;
		this.expected = expected;
	}
	
	@Test
	public void testSimple() {
		BusinessRule rule = new MultiBusinessRule(Arrays.stream(values).map(DefaultBusinessRule::new).toArray(size -> new BusinessRule[size]));
		ExecutionResult result = rule.execute(null).orElseThrow(() -> new NullPointerException("result is null"));
		if (name == null)
			Assert.assertEquals(expected, result.getValue());
		else
			Assert.assertEquals(expected, result.getValue(name));
	}
	
	@Parameters
	public static List<Object[]> data() {
		List<Object[]> list = new ArrayList<Object[]>();

		list.add(new Object[] { new String[] { "IF 1 + 1 = 2 THEN SET result = 1", "IF 2 + 2 = 4 THEN SET result2 = 2" }, "result", 1L });
		list.add(new Object[] { new String[] { "IF 1 + 1 = 2 THEN SET result = 1", "IF 2 + 2 = 4 THEN SET result2 = 2" }, "result2", 2L });

		return list;
	}
}
