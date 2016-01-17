class TrieNode {
        // Initialize your data structure here.
    
        //used to retrieve node's children
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        
        //used to decide whether curr node is leaf
        boolean isLeaf = false;
        
        //used to store curr node's character
        char c;
        
        //constructors
        public TrieNode(){}
        
        public TrieNode(char charc){
            this.c = charc;
        }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

/**
 *@param word is the string we want to insert 
 */
    // Inserts a word into the trie.
    public void insert(String word) {
        
        TrieNode currentNode = root;
        
        HashMap<Character, TrieNode> children = root.children;
            
        //solve illegal string
        if(word == null){
            return;
        }
        
        //transform the string to char array
        char[] wordInArray = word.toCharArray();
        
        for(int i = 0; i < wordInArray.length; i++){
            
            //if current node's hashtable has alread 
            //contained the char we want to insert
            if(children.containsKey(wordInArray[i])){
                currentNode = children.get(wordInArray[i]);
                children = currentNode.children;
                if(i == word.length() - 1){
                    currentNode.isLeaf = true;
                }
                continue;
            }
            
            //otherwise new a char node to store
            currentNode = new TrieNode(wordInArray[i]);
            
            //new node must be a leaf
            if(i == word.length() - 1){
                currentNode.isLeaf = true;
            }
            
            //put new node into table
            children.put(wordInArray[i], currentNode);
            children = currentNode.children;
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        
        TrieNode currentNode = root;
        
        HashMap<Character, TrieNode> children = currentNode.children;
        
        //whether current node is leaf
        boolean flag = false;
        
        for(int i = 0; i < word.length(); i++){
            
            // found a character never seen before
            if(!children.containsKey(word.charAt(i))){
                return false;
            }
            
            currentNode = children.get(word.charAt(i));
            children = currentNode.children;
        }
        
        return currentNode.isLeaf;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        
        TrieNode currentNode = root;
        
        HashMap<Character, TrieNode> children = currentNode.children;
        
        for(int i = 0; i < prefix.length(); i++){
            
            // found a character never seen before
            if(!children.containsKey(prefix.charAt(i))){
                return false;
            }
            
            currentNode = children.get(prefix.charAt(i));
            children = currentNode.children;
        }
        return true;
    }
}
