//BinarySearhTree

class Node{
    constructor(data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
    
}

class Tree{
    constructor(){
     this.root = null
    }

    //Insertion
    insert(data){
        const newNode = new Node(data);
        let current = this.root;
        if(current === null){
            this.root = newNode;
            return;
        }

        while(current != null){
            if(data < current.data ){
                if(current.left === null){
                    current.left = newNode;
                    return;
                }
                current = current.left;
            }else if(data > current.data){
                if(current.right === null){
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
        }
    }

    //Checking value;
    contains (value){
      let current = this.root;
      while(current !== null){
        if(current.data === value){
            return true;
        }else if(value > current.data){
            current = current.right
        }else{
            current = current.left
        }
        
      }
      return false
    }
    //To get a minValue of the right side:
    //for right side the Min value lies on its left side
    getMinValue (currentNode){
        if(currentNode.left == null){
            return currentNode.data
        }else{
            return this.getMinValue(currentNode.left)
        }
        }
    

    //Removing a value
    remove (data){
     this.removeHelper(data, this.root, null);
    }

    removeHelper(data, currentNode, parentNode) {
        //Base case of removeHelper RecursionFunction
        if (currentNode == null) {
          return;
        }
      
        if (data < currentNode.data) {
          this.removeHelper(data, currentNode.left, currentNode);
        } else if (data > currentNode.data) {
          this.removeHelper(data, currentNode.right, currentNode);
        } else {
          // Data found, start removal process
      
          // Case 1: currentNode has both right and left children
          if (currentNode.left !== null && currentNode.right !== null) {
            currentNode.data = this.getMinValue(currentNode.right);
            this.removeHelper(currentNode.data, currentNode.right, currentNode);
          } else {
            // Case 2: currentNode has either one child or no children
           
              // If the currentNode is not the root node with no children
              // if (parentNode.left === currentNode) {
              //     parentNode.left = null;
              // } else {
              //     parentNode.right = null;
              // }
                
            // Case 2.0: Check whether it has a leftNode (not right)
            if (parentNode === null) {
              if (currentNode.right === null) {
                // Changing its root to the leftNode of that
                this.root = currentNode.left;
              } else {
                // Case 2.1: Whether it has only rightNode
                // Then change its root to the right node
                this.root = currentNode.right;
              }
            } else {
              // Parent is not null
              // Current or data is in left of parentNode
              if (parentNode.left === currentNode) {
                // There is only leftNode to the currentNode (not right)
                if (currentNode.right === null) {
                  parentNode.left = currentNode.left;
                } else {
                  parentNode.left = currentNode.right;
                }
              } else {
                // There is only rightNode to the currentNode (not left)
                if (currentNode.left === null) {
                  parentNode.right = currentNode.right;
                } else {
                  parentNode.right = currentNode.left;
                }
              }
            }
          }
        }
      }
      
inOrder(){//left root right
this.inOrderHelper(this.root);
}
inOrderHelper(node){
if(node === null){
  return;
}else{
  this.inOrderHelper(node.left);
  console.log(node.data);
  this.inOrderHelper(node.right);
}
}
   
preOrder(){// root left right
this.preOrderHelper(this.root)
}
preOrderHelper(node){
  if(node === null){
    return;
  }else{
    console.log(node.data);
    this.preOrderHelper(node.left);
    this.preOrderHelper(node.right);
  }
}


postOrder(){//left right root
  this.postOrderHelper(this.root)

}
postOrderHelper(node){
  if(node === null){
    return;
  }else{
    this.postOrderHelper(node.left);
    this.postOrderHelper(node.right);
    console.log(node.data);
    
  }
}

findTheClosest(target){
  let current = this.root;
  let closest = current.data;
  while(current != null){
    if(Math.abs(target - closest) > Math.abs(target - current.data)){
      closest = current.data;
    }
    if(target< current.data){
      current = current.left
    }else if(target > current.data){
      current = current.right;
    }else if(target === current.data){
     return current.data;
    }
  }
  return closest;
}

}
let tree = new Tree();
tree.insert(5);
tree.insert(6);
tree.insert(12);
tree.insert(1);
//tree.remove(5);
//tree.inOrder();
//tree.preOrder();
//tree.preOrder();
console.log(tree.findTheClosest(2));

//let result = tree.contains(5);
//console.log(result);

