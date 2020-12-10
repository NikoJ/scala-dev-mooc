package module1

import module1.list.List




object App {


  def main(args: Array[String]): Unit = {

    println(opt.Option.None.orElse(4))
    println(opt.Option.Some(2).filter(x=>5>x))
    println(opt.Option.Some(2).zip(opt.Option.Some(3)).get)
  }
}
