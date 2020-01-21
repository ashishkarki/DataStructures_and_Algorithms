package dataStructures.linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LinkedListTest {

    final int initData = 10;
    LinkedList<Integer> linkedList = null;

    @BeforeEach
    public void beforeEach() {
        linkedList = new LinkedList<Integer>();
    }

    @Test
    public void insertInFront_creates_and_returns_newNode() {
        final int newHeadData = 20;
        linkedList.insertInFront(newHeadData);

        assertThat(linkedList.head.data()).isEqualTo(newHeadData);
        assertThat(linkedList.size).isEqualTo(1);
    }

    @Test
    public void insertInFront_returns_newlyInsertedNode() {
        insertFrontHelper();

        assertThat(linkedList.head.data()).isEqualTo(newHeadData[0]);
        assertThat(linkedList.size).isEqualTo(3);
    }

    @Test
    public void deleteNode_returnsFalse_if_listIsEmpty() {
        boolean expectedBool = linkedList.deleteNode(100);

        assertThat(expectedBool).isEqualTo(false);
    }

    @Test
    public void deleteNode_returnsFalse_if_NodeNotFound() {
        insertFrontHelper();
        boolean expectedBool = linkedList.deleteNode(100);

        assertThat(expectedBool).isEqualTo(false);
    }

    @Test
    public void deleteNode_returnsTrue_if_DeleteNodeIsHead() {
        insertFrontHelper();
        boolean expectedBool = linkedList.deleteNode(10);

        assertThat(expectedBool).isEqualTo(true);
        assertThat(linkedList.size).isEqualTo(2);
        assertThat(linkedList.head.data()).isEqualTo(newHeadData[1]);
    }

    final int[] newHeadData = {10, 20, 30};

    private void insertFrontHelper() {
        linkedList.insertInFront(newHeadData[2]);
        linkedList.insertInFront(newHeadData[1]);
        linkedList.insertInFront(newHeadData[0]);
    }
}