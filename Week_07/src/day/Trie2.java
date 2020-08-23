package day;

/**
 * @author xie
 * @description
 * @date 2020/8/21 14:10
 */
public class Trie2 {
    private TrieNode2 root;
    // 初始化root节点
    public Trie2(){
        root=new TrieNode2();
    }
    // 插入一个单词到字典树中
    public void insert(String word){
        TrieNode2 node=root;
        //循环遍历所有的单词，依次插入
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if(!node.containsKey(currentChar)){
                node.put(currentChar,new TrieNode2());
            }
            node=node.get(currentChar);
        }
        node.setEnd();
    }
    // 查找是否存在前缀
    private TrieNode2 searchPrefix(String word){
        TrieNode2 node=root;
        for (int i = 0; i < word.length(); i++) {
            char c=word.charAt(i);
            if(node.containsKey(c)){
                node=node.get(c); //进入下一层
            }else {
                return null;
            }
        }
        return node;  //返回的是最后一个单词所在的最后一个节点
    }
    public boolean search(String word){
        TrieNode2 node2=searchPrefix(word);
        return node2 != null && node2.isEnd();
    }

    //返回任何单词在字典树中是否存在
    public boolean startsWith(String prefix){
        TrieNode2 node=searchPrefix(prefix);
        return node != null;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
         // 返回 true
        System.out.println( trie.search("apple"));
            // 返回 false
        System.out.println(trie.search("app"));
        trie.startsWith("app"); // 返回 true
        trie.insert("app");
        trie.search("app");     // 返回 true

    }
}
