package com.kris.todolist.model;

import org.junit.jupiter.api.Test;

import static com.kris.todolist.model.CompletionStatus.TODO;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void test_Create_Task_With_No_Description() {
        Task task = new Task();
        task.setName("Test");
        task.setCompletionStatus(TODO);

        assertEquals("Test", task.getName());
        assertNull(task.getDescription());
        assertEquals(TODO, task.getCompletionStatus());
    }

    @Test
    void test_Create_Task_With_No_Name() {
        Task task = new Task();
        task.setDescription("Test");
        task.setCompletionStatus(TODO);

        assertNull(task.getName());
        assertEquals("Test", task.getDescription());
        assertEquals(TODO, task.getCompletionStatus());
    }

    @Test
    void test_Create_Task_With_No_CompletionStatus() {
        Task task = new Task();
        task.setName("Test");
        task.setDescription("Test");

        assertEquals("Test", task.getName());
        assertEquals("Test", task.getDescription());
        assertNull(task.getCompletionStatus());
    }

    @Test
    void test_Create_Task_With_No_Name_No_Description() {
        Task task = new Task();
        task.setCompletionStatus(TODO);

        assertNull(task.getName());
        assertNull(task.getDescription());
        assertEquals(TODO, task.getCompletionStatus());
    }

    @Test
    void test_Create_Task_With_No_Name_No_CompletionStatus() {
        Task task = new Task();
        task.setDescription("Test");

        assertNull(task.getName());
        assertEquals("Test", task.getDescription());
        assertNull(task.getCompletionStatus());
    }

    @Test
    void test_Create_Task_With_No_Description_No_CompletionStatus() {
        Task task = new Task();
        task.setName("Test");

        assertEquals("Test", task.getName());
        assertNull(task.getDescription());
        assertNull(task.getCompletionStatus());
    }

    @Test
    void test_Create_Task_With_No_Name_No_Description_No_CompletionStatus() {
        Task task = new Task();

        assertNull(task.getName());
        assertNull(task.getDescription());
        assertNull(task.getCompletionStatus());
    }

    @Test
    void test_Create_Task_With_All_Parameters() {
        Task task = new Task("Test", "Test", TODO);

        assertEquals("Test", task.getName());
        assertEquals("Test", task.getDescription());
        assertEquals(TODO, task.getCompletionStatus());
    }

    @Test
    void test_Create_Task_With_No_Description_All_Parameters() {
        Task task = new Task("Test", null, TODO);

        assertEquals("Test", task.getName());
        assertNull(task.getDescription());
        assertEquals(TODO, task.getCompletionStatus());
    }

    @Test
    void test_Set_Id() {
        Task task = new Task();
        task.setId(1L);

        assertEquals(1L, task.getId());
    }

    @Test
    void test_Set_Name() {
        Task task = new Task();
        task.setName("Test");

        assertEquals("Test", task.getName());
    }

    @Test
    void test_Set_Description() {
        Task task = new Task();
        task.setDescription("Test");

        assertEquals("Test", task.getDescription());
    }

    @Test
    void test_Set_CompletionStatus() {
        Task task = new Task();
        task.setCompletionStatus(TODO);

        assertEquals(TODO, task.getCompletionStatus());
    }

    @Test
    void test_To_String() {
        Task task = new Task("Test", "Test", TODO);

        assertEquals("Task{id=0, name='Test', description='Test', completionStatus=TODO}", task.toString());
    }

    @Test
    void test_To_String_With_Null_Id() {
        Task task = new Task("Test", "Test", TODO);
        task.setId(null);

        assertEquals("Task{id=null, name='Test', description='Test', completionStatus=TODO}", task.toString());
    }

}