package models


object CodeGen extends App {
  slick.codegen.SourceCodeGenerator.run(
    "slick.jdbc.PostgresProfile",
    "org.postgresql.Driver",
    "jdbc:postgresql://localhost:5433/play_framework",
    "/C:/Users/Krishna/WorkSpace/StudyTime/playAsignment/playAsignment/app/",
    "models", Some("postgres"), Some("qVF^eHG9kKP3Dtm!"), true, false
  )
}


