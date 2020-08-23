package day;

/**
 * @author xie
 * @description  字典树
 * @date 2020/8/19 17:26
 */
public class Trie {
    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
        root.val=' ';
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
         TrieNode ws=root;
         for(int i=0;i<word.length();i++){
             char c=word.charAt(i);
             if(ws.childern[c - 'a']==null){
                 ws.childern[c - 'a']=new TrieNode(c);
             }
             ws=ws.childern[c - 'a'];
         }
         ws.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
         TrieNode ws=root;
        for (int i = 0; i < word.length(); i++) {
            char c= word.charAt(i);
            if(ws.childern[c - 'a']==null) return false;
            ws = ws.childern[c - 'a'];
        }
        return ws.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
         TrieNode ws=root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(ws.childern[c - 'a']== null) return false;
            ws=ws.childern[c - 'a'];
        }
        return true;
    }
}
