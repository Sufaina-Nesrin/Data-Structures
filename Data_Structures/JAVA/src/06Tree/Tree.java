public class Tree{

    class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }
    Node root;

    public void insert(int data){
        Node currentNode = root;
        //case 1 root == null
        if(currentNode == null){
            root = new Node(data);
            return;
        }
        while(true){
            if(data < currentNode.data){
                //case where current node == null
                 if(currentNode.left == null){
                    currentNode.left = new Node(data);
                    break;
                 }else{
                    //case where left has an element
                 currentNode = currentNode.left  ; 
                 }
            }else{
                if(data > currentNode.data){
                //case where current right node == null
                 if(currentNode.right == null){
                    currentNode.right = new Node(data);
                    break;
                 }else{
                    //case where right has an element
                 currentNode = currentNode.right;   
                 }
            }

            }
        }

    }

    public boolean contains(int data){
        Node currentNode = root;
        while(currentNode != null){
            if(data < currentNode.data){
                currentNode = currentNode.left;
            }else if(data >currentNode.data){
                currentNode = currentNode.right;
            }else{
                //if not it will be the number itself
                return true;
            }
        }
        return false;
    }

    public void remove(int data){
     removeHelper(data,root,null);
    }

    private void removeHelper(int data, Node currentNode, Node parentNode){
        while(currentNode != null){
          if(data < currentNode.data){
            parentNode = currentNode;
            currentNode = currentNode.left;
          }else if(data > currentNode.data){
            parentNode = currentNode;
            currentNode = currentNode.right;
          }else{
            if(currentNode.left != null && currentNode.right != null){
             currentNode.data = getMinValue(currentNode.right);
             removeHelper(currentNode.data, currentNode.right, currentNode);
            }else{
                if(parentNode == null){
                    if(currentNode.right == null){
                        root = currentNode.left;
                    }else{
                        root = currentNode.right;
                    }
                }else{
                   if(parentNode.left == currentNode){
                      if(currentNode.right == null){
                        parentNode.left = currentNode.left;
                      }else{
                        parentNode.left = currentNode.right;
                      }
                   }else{
                    if(currentNode.left == null){
                        parentNode.right = currentNode.right;
                      }else{
                        parentNode.right = currentNode.left;
                      }
                   } 
                }
            }
            break;
          }
        }

    }

    public int getMinValue(Node currentNode){
          if(currentNode.left == null){
            return currentNode.data;
          }else{
            return getMinValue(currentNode.left);
          }
    }

    public void inOrder(){//LEFT ROOT RIGHT
     inOrderHelper(root);
    }
    public void inOrderHelper(Node node){
        if(node != null){
            inOrderHelper(node.left);
            System.out.print(node.data+" ");
            inOrderHelper(node.right);
        }

    }

    public void preOrder(){ //ROOT LEFT RIGHT
       preOrderHelper(root);
    }
    public void preOrderHelper(Node node){
       if(node != null){
        System.out.print(node.data+" ");
            preOrderHelper(node.left);
            preOrderHelper(node.right);
        }   
    }

    public void postOrder(){ //LEFT RIGHT ROOT
      postOrderHelper(root)  ;
    }
    public void postOrderHelper(Node node){
        if(node != null){
            postOrderHelper(node.left);
            postOrderHelper(node.right);
            System.out.print(node.data+" ");
            
            
        }
    }
    public int findClosest(int target){
        Node currentNode = root;
        int closest = currentNode.data;
        while(currentNode != null){
            if(Math.abs(target - closest)> Math.abs(target - currentNode.data)){
                closest  = currentNode.data;
            }
            if(target<currentNode.data){
                 currentNode = currentNode.left;
            }else if(target> currentNode.data){
                currentNode = currentNode.right;
            }else{
                break;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        Tree binarySearch = new Tree();
       binarySearch.insert(10);
       binarySearch.insert(8);
       binarySearch.insert(4);
       binarySearch.insert(9);
       binarySearch.insert(11);
       System.out.println(binarySearch.findClosest(1));
   
  binarySearch.inOrder();
  System.out.println();
       binarySearch.preOrder();
       System.out.println();
       binarySearch.postOrder();
      // binarySearch.remove(15);
       //System.out.println(binarySearch.contains(15));
    }

}