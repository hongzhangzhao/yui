package Arrays;
import java.nio.charset.MalformedInputException;
/*
 * 16.5
 * 
 * */
import java.util.*;

public class ArrayOgGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		//����һ������,�����Ͳ���ʵ����
		List<String>[] ls;
		
		List[] la = new List[10];
		//����ͨ��һ���޷��͵����飬ת�����ڸ������з��͵��������ã�
		ls = (List<String>[])la;  //checked warning
		
		ls[0] = new ArrayList<String>();
		//  type mismatch
		//ls[1] = new ArrayList<Integer>();
		
		//List<String>��Object��������
		Object[] obj = ls;
		
		//û�б�Թ�ı��������
		obj[1] = new ArrayList<Integer>();
		//ͨ��һ���޷��͵�����ת�͸����з��͵�����ʵ�����������͵��������Ҳ����Object�࣬���Կ��Ը���Object��������
		List<BerylliumSphere>[] sphere = (List<BerylliumSphere>[])new List[10];
		
		for(int i=0;i<sphere.length;i++){
			sphere[i] = new ArrayList<BerylliumSphere>();
		}
	}
}
