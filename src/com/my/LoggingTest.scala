package com.my

import akka.actor.ActorLogging
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.remote.RemotingLifecycleEvent

class LoggingActor extends Actor with ActorLogging{
  def receive = {
    case msg:String => {
      println("receive::"+msg)
      log.error("receive::"+"received msg")
      this.context.system.eventStream.publish(this)
    }
    case _ => println("nnnnnnnnn")
  }
}

object LoggingMain extends App{
  val system = ActorSystem("hello");
  val a = system.actorOf(Props[LoggingActor],"helloActor")
  system.eventStream.subscribe(a, classOf[String])
  system.eventStream.publish(this)
  a.tell("hello", null)
}