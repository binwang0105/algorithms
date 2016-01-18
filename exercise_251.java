public class Vector2D {

    List<Iterator<Integer>> it;
    int curr = 0;
    
    //��Ӧһ��IteratorList
    public Vector2D(List<List<Integer>> vec2d) {
        it = new ArrayList<Iterator<Integer>>();
        for(List<Integer> i: vec2d){
            if(i.size()>0){
                it.add(i.iterator());
            }
        }
    }

    public int next() {
        //��Ϊ��ʹ��nextǰ�����ж�һ��hasNext�������Ͳ����ٽ����ж���
        Integer ret = this.it.get(curr).next();
        if(!it.get(curr).hasNext()){
            curr++;
        }
        return ret;
    }

    public boolean hasNext() {
        return this.curr < this.it.size() && this.it.get(curr).hasNext();
    }
}