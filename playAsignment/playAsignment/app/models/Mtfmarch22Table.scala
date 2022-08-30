package models
// AUTO-GENERATED Slick data model for table Mtfmarch22
trait Mtfmarch22Table {

  self:Tables  =>

  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}
  /** Entity class storing rows of table Mtfmarch22
   *  @param storenumber Database column storenumber SqlType(text), Default(None)
   *  @param storename Database column storename SqlType(text), Default(None)
   *  @param hubbedstorecode Database column hubbedstorecode SqlType(text), Default(None)
   *  @param allwdls Database column allwdls SqlType(int4), Default(None)
   *  @param totalexclgst Database column totalexclgst SqlType(money), Default(None)
   *  @param gst Database column gst SqlType(money), Default(None)
   *  @param totalincgst Database column totalincgst SqlType(money), Default(None) */
  case class Mtfmarch22Row(storenumber: Option[String] = None, storename: Option[String] = None, hubbedstorecode: Option[String] = None, allwdls: Option[Int] = None, totalexclgst: Option[Double] = None, gst: Option[Double] = None, totalincgst: Option[Double] = None)
  /** GetResult implicit for fetching Mtfmarch22Row objects using plain SQL queries */
  implicit def GetResultMtfmarch22Row(implicit e0: GR[Option[String]], e1: GR[Option[Int]], e2: GR[Option[Double]]): GR[Mtfmarch22Row] = GR{
    prs => import prs._
    Mtfmarch22Row.tupled((<<?[String], <<?[String], <<?[String], <<?[Int], <<?[Double], <<?[Double], <<?[Double]))
  }
  /** Table description of table mtfmarch22. Objects of this class serve as prototypes for rows in queries. */
  class Mtfmarch22(_tableTag: Tag) extends profile.api.Table[Mtfmarch22Row](_tableTag, "mtfmarch22") {
    def * = (storenumber, storename, hubbedstorecode, allwdls, totalexclgst, gst, totalincgst) <> (Mtfmarch22Row.tupled, Mtfmarch22Row.unapply)

    /** Database column storenumber SqlType(text), Default(None) */
    val storenumber: Rep[Option[String]] = column[Option[String]]("storenumber", O.Default(None))
    /** Database column storename SqlType(text), Default(None) */
    val storename: Rep[Option[String]] = column[Option[String]]("storename", O.Default(None))
    /** Database column hubbedstorecode SqlType(text), Default(None) */
    val hubbedstorecode: Rep[Option[String]] = column[Option[String]]("hubbedstorecode", O.Default(None))
    /** Database column allwdls SqlType(int4), Default(None) */
    val allwdls: Rep[Option[Int]] = column[Option[Int]]("allwdls", O.Default(None))
    /** Database column totalexclgst SqlType(money), Default(None) */
    val totalexclgst: Rep[Option[Double]] = column[Option[Double]]("totalexclgst", O.Default(None))
    /** Database column gst SqlType(money), Default(None) */
    val gst: Rep[Option[Double]] = column[Option[Double]]("gst", O.Default(None))
    /** Database column totalincgst SqlType(money), Default(None) */
    val totalincgst: Rep[Option[Double]] = column[Option[Double]]("totalincgst", O.Default(None))
  }
  /** Collection-like TableQuery object for table Mtfmarch22 */
  lazy val Mtfmarch22 = new TableQuery(tag => new Mtfmarch22(tag))
}
