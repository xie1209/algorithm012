package day;

/**
 * @author xie
 * @description
 * @date 2020/8/21 13:59
 */
public class TrieNode2 {
    private TrieNode2[] links;
    private final int R=26;
    private boolean isEnd;
    public TrieNode2(){
        links=new TrieNode2[R];
    }
    // 是否存在该子节点
    public boolean containsKey(char ch){
        return links[ch - 'a'] != null;
    }
    // 获取该值的节点
    public TrieNode2 get(char ch){
        return links[ch - 'a'];
    }
    // 存入该子节点
    public void put(char ch,TrieNode2 node){
        links[ch - 'a']=node;
    }
    //设置为末尾
    public void setEnd(){
        isEnd=true;
    }
    //
    public boolean isEnd(){
        return isEnd;
    }
}
