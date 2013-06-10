package net.unikernel.bummel.logic_elements;

import java.util.Map;
import java.util.TreeMap;
import net.unikernel.bummel.logic_elements.Split.Split;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author uko
 */
public class SplitTest
{
	Split instance;
	@BeforeMethod
	public void setUp()
	{
		instance = new Split();
	}
	@AfterMethod
	public void tearDown()
	{
		instance = null;
	}
	/**
	 * Test of process method, of class Split.
	 */
	@Test
	public void testProcess000()
	{
		System.out.println("split_process000");
		Map<String, Double> valuesOnPorts = new TreeMap<>();
		valuesOnPorts.put("input", 0.);
		valuesOnPorts.put("output1", 0.);
		valuesOnPorts.put("output2", 0.);
		Map<String, Double> expResult= new TreeMap<>();
		expResult.put("input", 0.);
		expResult.put("output1", 0.);
		expResult.put("output2", 0.);
		Map result = instance.process(valuesOnPorts);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testProcess001()
	{
		System.out.println("split_process001");
		Map<String, Double> valuesOnPorts = new TreeMap<>();
		valuesOnPorts.put("input", 0.);
		valuesOnPorts.put("output1", 0.);
		valuesOnPorts.put("output2", 1.);
		Map<String, Double> expResult= new TreeMap<>();
		expResult.put("input", 0.);
		expResult.put("output1", 0.);
		expResult.put("output2", 0.);
		Map result = instance.process(valuesOnPorts);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testProcess010()
	{
		System.out.println("split_process010");
		Map<String, Double> valuesOnPorts = new TreeMap<>();
		valuesOnPorts.put("input", 0.);
		valuesOnPorts.put("output1", 1.);
		valuesOnPorts.put("output2", 0.);
		Map<String, Double> expResult= new TreeMap<>();
		expResult.put("input", 0.);
		expResult.put("output1", 0.);
		expResult.put("output2", 0.);
		Map result = instance.process(valuesOnPorts);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testProcess011()
	{
		System.out.println("split_process011");
		Map<String, Double> valuesOnPorts = new TreeMap<>();
		valuesOnPorts.put("input", 0.);
		valuesOnPorts.put("output1", 1.);
		valuesOnPorts.put("output2", 1.);
		Map<String, Double> expResult= new TreeMap<>();
		expResult.put("input", 0.);
		expResult.put("output1", 0.);
		expResult.put("output2", 0.);
		Map result = instance.process(valuesOnPorts);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testProcess100()
	{
		System.out.println("split_process100");
		Map<String, Double> valuesOnPorts = new TreeMap<>();
		valuesOnPorts.put("input", 1.);
		valuesOnPorts.put("output1", 0.);
		valuesOnPorts.put("output2", 0.);
		Map<String, Double> expResult= new TreeMap<>();
		expResult.put("input", 0.);
		expResult.put("output1", 1.);
		expResult.put("output2", 1.);
		Map result = instance.process(valuesOnPorts);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testProcess101()
	{
		System.out.println("split_process101");
		Map<String, Double> valuesOnPorts = new TreeMap<>();
		valuesOnPorts.put("input", 1.);
		valuesOnPorts.put("output1", 0.);
		valuesOnPorts.put("output2", 1.);
		Map<String, Double> expResult= new TreeMap<>();
		expResult.put("input", 0.);
		expResult.put("output1", 1.);
		expResult.put("output2", 1.);
		Map result = instance.process(valuesOnPorts);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testProcess110()
	{
		System.out.println("split_process110");
		Map<String, Double> valuesOnPorts = new TreeMap<>();
		valuesOnPorts.put("input", 1.);
		valuesOnPorts.put("output1", 1.);
		valuesOnPorts.put("output2", 0.);
		Map<String, Double> expResult= new TreeMap<>();
		expResult.put("input", 0.);
		expResult.put("output1", 1.);
		expResult.put("output2", 1.);
		Map result = instance.process(valuesOnPorts);
		assertEquals(expResult, result);
	}
	
	@Test
	public void testProcess111()
	{
		System.out.println("split_process111");
		Map<String, Double> valuesOnPorts = new TreeMap<>();
		valuesOnPorts.put("input", 1.);
		valuesOnPorts.put("output1", 1.);
		valuesOnPorts.put("output2", 1.);
		Map<String, Double> expResult= new TreeMap<>();
		expResult.put("input", 0.);
		expResult.put("output1", 1.);
		expResult.put("output2", 1.);
		Map result = instance.process(valuesOnPorts);
		assertEquals(expResult, result);
	}
}