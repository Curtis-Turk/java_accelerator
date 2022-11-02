package todo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TodoTest {

  @Test
  public void testStartsWithEmptyTodo() {
    Todo todoUnderTest = new Todo();
    assertTrue("initialise as empty", todoUnderTest.tasks.isEmpty());
  }

  @Test
  public void testAddsTaskToTodo() {
    Todo todoUnderTest = new Todo();
    ArrayList<String> expectedArray = new ArrayList<String>();
    expectedArray.add("Apply for a job");
    assertEquals("Should add task", expectedArray, todoUnderTest.add("Apply for a job"));
  }

  @Test
  public void testDisplaysTasks() {
    Todo todoUnderTest = new Todo();
    ArrayList<String> expectedArray = new ArrayList<String>();
    expectedArray.add("Apply for a job");
    expectedArray.add("Clean my room");

    todoUnderTest.add("Apply for a job");
    todoUnderTest.add("Clean my room");

    assertEquals("Should match expected list", expectedArray, todoUnderTest.getTasks());
  }
}
