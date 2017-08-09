package Generics;

/**
 * 15.2.2
 *
 *
 */
import java.util.*;
public class LinkedStack<T> {

	private static class Node<U> {
		U item;
		Node<U> next;
		Node() {
			item = null;
			next = null;
		}
		Node(U item,Node<U> next) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next  == null;
		}
	}

	private Node<T> top = new Node<>();

	public void push(T item) {
		top = new Node<T>(item,top);
	}

	public T pop() {
		T result = top.item;
		if(!top.end()) {
			top = top.next;
		}

		return result;

	}

	public static void main(String[] args) {
		LinkedStack<String> ls = new LinkedStack<>();
for(String s : "p o s".split(" ")) {
			ls.push(s);
		}
		String s;
		while((s = ls.pop()) != null) {
			System.out.println(s);
		}

		LinkedList<String> ll = new LinkedList<>();


	}
}
