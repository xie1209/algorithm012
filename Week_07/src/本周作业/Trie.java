package 本周作业;

/**
 * @author xie
 * @description   实现字典树,
 */
public class Trie {
 /*   private  Trie[] next;
    private  boolean isEnd;

    Trie(){
        next=new Trie[26];
        isEnd=false;
    }

    //插入单词到字典树中
    public void insert(String word){
        Trie node=this;
        for(char c:word.toCharArray()){
            if(node.next[c - 'a']==null) node.next[c - 'a']=new Trie();
            node=node.next[c - 'a'];
        }
        node.isEnd=true;
    }

    //查询
    public boolean search(String word){
        Trie node=searchFix(word);
        return node==null && node.isEnd==true;
    }
    //查询前缀
    public boolean startWith(String word){
        Trie node=searchFix(word);
        return node==null;
    }

    //查询辅助
    private Trie searchFix(String word){
        Trie node=this;
        for(char c:word.toCharArray()){
            if(node.next[c - 'a'] != null)
                node=node.next[c - 'a'];
            else
                return null;
        }
        return node;
    }*/
 //仅使用两个变量
 private Trie[] next; //存26个子节点
    private boolean isEnd;  //是否为一个单词的结束

    /** Initialize your data structure here. */
    public Trie() {
        next=new Trie[26];
        isEnd=false;
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie node=this;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(node.next[c - 'a'] == null)  node.next[c - 'a']=new Trie();
            node=node.next[c - 'a'];     //  指针下移
        }
        node.isEnd=true;  //单词插入完后，标记为一个单词结束
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node=searchfix(word);
        return node != null && node.isEnd==true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node=searchfix(prefix);
        return  node != null;
    }

    private Trie searchfix(String word){
        Trie node=this;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(node.next[c - 'a'] != null) {
                node=node.next[c-'a'];
            }else{
                return null;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));

    }
}
