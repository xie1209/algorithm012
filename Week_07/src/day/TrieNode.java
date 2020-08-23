package day;

/**
 * @author xie
 * @description
 * @date 2020/8/19 17:50
 */
public class TrieNode {
    public char val;
    public boolean isWord;
    public TrieNode[] childern=new TrieNode[26];
    public TrieNode(){}
    TrieNode(char c){
        TrieNode node=new TrieNode();
        node.val=c;
    }
}
