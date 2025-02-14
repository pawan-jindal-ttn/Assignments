package Ques4;

sealed class Grandparent permits Parent1, Parent2, Parent3{
    //permitting Ques45.Parent1, Ques45.Parent2 and Ques45.Parent3 to inherit Ques45.Grandparent

}
final class Parent1 extends Grandparent{
    //Ques45.Parent1 cant be extended any more due to final keyword
}
sealed class Parent2 extends Grandparent permits Child1 {
    //Only Ques45.Child1 can inherit Ques45.Parent2
}
non-sealed class Parent3 extends Grandparent{
    //Ques45.Parent3 can be extended freely
}

final class Child1 extends Parent2{
    //Ques45.Child1 cannot be inherited further
}