package binaryTree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LowestCommonAncestor {

    public String getLowestCommonAncestor(Node root, String value1, String value2){


        return "";
    }

    private HashSet<String> getPathForNode(Node root, String value, List<String> path){
        Object leftValues = null;
        Object rightValues = null;
        //if(root.value == value)

        if (root.left != null) {
        leftValues = getPathForNode(root.left, value, path);
        }
        if (root.right != null) {
         rightValues = getPathForNode(root.right, value, path);
        }


        return null;
    }



}
