package com.kris.todolist.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompletionStatusTest {

    @Test
    void test_CompletionStatus_Values() {
        assertEquals("TODO", CompletionStatus.TODO.toString());
        assertEquals("IN_PROGRESS", CompletionStatus.IN_PROGRESS.toString());
        assertEquals("DONE", CompletionStatus.DONE.toString());
    }

    @Test
    void test_CompletionStatus_Values_Are_Not_Null() {
        assertNotNull(CompletionStatus.TODO.toString());
        assertNotNull(CompletionStatus.IN_PROGRESS.toString());
        assertNotNull(CompletionStatus.DONE.toString());
    }

    @Test
    void test_CompletionStatus_Values_Are_Not_Empty() {
        assertNotEquals("", CompletionStatus.TODO.toString());
        assertNotEquals("", CompletionStatus.IN_PROGRESS.toString());
        assertNotEquals("", CompletionStatus.DONE.toString());
    }

    @Test
    void test_CompletionStatus_Values_Are_Not_Blank() {
        assertNotEquals(" ", CompletionStatus.TODO.toString());
        assertNotEquals(" ", CompletionStatus.IN_PROGRESS.toString());
        assertNotEquals(" ", CompletionStatus.DONE.toString());
    }

}