package org.isle.persistence;

public interface CRUDMapper<V, K> {
	//타입 유연하게 쓰기로
	public void create(V vo) throws Exception;
	
	public V read(K key) throws Exception;
	
	public void update(V vo ) throws Exception;
	
	public void delete(K key) throws Exception;
	

}
