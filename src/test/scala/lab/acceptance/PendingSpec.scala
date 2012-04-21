package uk.co.xtrade.acceptance

import org.specs2._
import org.junit.runner._
import runner._

@RunWith(classOf[JUnitRunner])
class PendingSpec extends Specification { def is =

	"this example fails for now"  ! e1

	def e1 = { 1 must be equalTo(2) }.pendingUntilFixed("ISSUE-123")

}
