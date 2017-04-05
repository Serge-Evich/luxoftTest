package luxoft.binarytree;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BinaryTreeTestCase {

    private BinaryTreeNode binaryTreeNodeOne;
    private BinaryTreeNode binaryTreeNodeTwo;
    private BinaryTreeNode binaryTreeNodeOneLeft;
    private BinaryTreeNode binaryTreeNodeOneRight;
    private BinaryTreeNode binaryTreeNodeTwoLeft;
    private BinaryTreeNode binaryTreeNodeTwoRight;

    @Before
    public void setUp() {
        binaryTreeNodeOne = new BinaryTreeNode(1);
        binaryTreeNodeTwo = new BinaryTreeNode(1);
        binaryTreeNodeOneLeft = new BinaryTreeNode(2);
        binaryTreeNodeOneRight = new BinaryTreeNode(3);
        binaryTreeNodeTwoLeft = new BinaryTreeNode(2);
        binaryTreeNodeTwoRight = new BinaryTreeNode(3);
    }

    @Test
    public void compareEqualTrees() {

        binaryTreeNodeOne.setLeft( binaryTreeNodeOneLeft );
        binaryTreeNodeOne.setRight( binaryTreeNodeOneRight );

        binaryTreeNodeTwo.setLeft( binaryTreeNodeTwoLeft );
        binaryTreeNodeTwo.setRight( binaryTreeNodeTwoRight );

        assertThat( BinaryTreeUtils.treeEquals( binaryTreeNodeOne, binaryTreeNodeTwo ), is( true ) );
    }

    @Test
    public void compateNotEqualTrees() {
        binaryTreeNodeOne.setLeft( binaryTreeNodeOneLeft );
        binaryTreeNodeOne.setRight( binaryTreeNodeOneRight );

        binaryTreeNodeTwo.setLeft( binaryTreeNodeTwoRight );
        binaryTreeNodeTwo.setRight( binaryTreeNodeTwoLeft );

        assertThat( BinaryTreeUtils.treeEquals( binaryTreeNodeOne, binaryTreeNodeTwo ), is( false ) );
    }
}
