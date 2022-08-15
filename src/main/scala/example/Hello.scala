package example

import com.segment.analytics.Analytics

object Hello extends App {
  private val writeKey = "foo bar"

  println("Creating Client...")
  private val client = Analytics.builder(writeKey).build()
  println("Created!")
}
