package day;

/**
 * @author xie
 * @description  Trie模板
 * @date 2020/8/21 15:53
 */
public class Trie3 {
    private boolean isEnd; //是否为最后一个单词
    private Trie3[] next; //存的是下一层
    private Trie3(){
        isEnd=false;
        next=new Trie3[26];
    }

    //插入一个单词
    public void insert(String word){
        if(word == null || word.length()==0) return;
        Trie3 curr=this;
        char[] words=word.toCharArray();
        for(int i=0;i<words.length;i++){
            int n=words[i] - 'a';
            if(curr.next[n]==null) curr.next[n]=new Trie3();
            curr=curr.next[n];
        }
        curr.isEnd=true;
    }
    //查找
    public boolean search(String word){
        Trie3 node=searchPrefix(word);
        return node != null && node.isEnd;
    }

    //返回该前缀节点
    public boolean startWith(String prefix){
        Trie3 node=searchPrefix(prefix);
        return node != null;
    }
    //查找前缀
    private Trie3 searchPrefix(String word){
        Trie3 node=this;
        char[] words=word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            node=node.next[words[i] - 'a'];
            if(node==null) return null;
        }
        return node;
    }

}
