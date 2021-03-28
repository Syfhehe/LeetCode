package DataStructure.Tree.HuffmanTree;

public class Node implements Comparable<Node> {
	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

	int value;
	Node lNode;
	Node rNode;

	public Node(int value) {
		this.value = value;
	}

	public void setlNode(Node lNode) {
		this.lNode = lNode;
	}

	public void setrNode(Node rNode) {
		this.rNode = rNode;
	}

	public void front() {
		System.out.println(this.value);

		if (lNode != null) {
			lNode.front();
		}
		if (rNode != null) {
			rNode.front();
		}
	}

	public void mid() {
		if (lNode != null) {
			lNode.mid();
		}

		System.out.println(this.value);

		if (rNode != null) {
			rNode.mid();
		}
	}

	public void after() {
		if (lNode != null) {
			lNode.after();
		}
		if (rNode != null) {
			rNode.after();
		}

		System.out.println(this.value);
	}

	// ����
	public Node frontSearch(int val) {
		Node target = null;
		if (this.value == val) {
			return this;
		} else {
			if (lNode != null) {
				target = lNode.frontSearch(val);
			}
			if (target != null) {
				return target;
			}
			if (rNode != null) {
				target = rNode.frontSearch(val);
			}
			if (target != null) {
				return target;
			}
		}
		return target;
	}

	// ɾ������
	public void delete(int i) {
		Node parentNode = this;
		// �����
		if (parentNode.lNode != null && parentNode.lNode.value == i) {
			parentNode.lNode = null;
			return;
		}
		// �Ҷ���
		if (parentNode.rNode != null && parentNode.rNode.value == i) {
			parentNode.rNode = null;
			return;
		}
		// �ݹ��鲢ɾ�������
		parentNode = lNode;
		if (parentNode != null) {
			parentNode.delete(i);
		}
		// �ݹ��鲢ɾ���Ҷ���
		parentNode = rNode;
		if (parentNode != null) {
			parentNode.delete(i);
		}

	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return  o.value- this.value;
	}

}
