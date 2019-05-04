import org.apache.logging.log4j.{LogManager, Logger}

object Main extends App {
  private final val logger: Logger = LogManager.getLogger()

  logger.info("This is simple scala project using SBT.")
}
