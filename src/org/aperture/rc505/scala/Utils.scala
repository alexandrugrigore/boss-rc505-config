package org.aperture.rc505.scala

object Utils {
  def nameToConfig(str: String): NAME = {
    val ints =  if (str.length < 12) {
      str.padTo(12, ' ').map(_.toInt)
    } else {
      str.take(12).map(_.toInt)
    }

    NAME(ints(0), ints(1), ints(2), ints(3), ints(4), ints(5), ints(6), ints(7), ints(8), ints(9), ints(10), ints(11))
  }

  def parseName(memoryName: NAME): String = {
    memoryName.productIterator.map(_.asInstanceOf[Int].toChar).mkString
  }

  def copyMemory(src: MutableMemory): Unit = {
    val srcName = Utils.parseName(src.memory.name)
    MainApp.memoriesCache.foreach(mem => {
      if (Utils.parseName(mem.memory.name).strip().equals("INIT MEMORY")) {
        mem.memory = src.memory.copy(name = Utils.nameToConfig(s"CP ${srcName}"))
      }
    })
  }

  /**
   * for copying other nested values
   * TODO
   */
  def copyFieldValue[T <: Product](source: T, target: T, fieldName: String): T = {
    val sourceValues = source.productElementNames.zip(source.productIterator).toMap
    val targetValues = target.productElementNames.zip(target.productIterator).toMap

    val updatedValues = targetValues.map {
      case (name, value) if name == fieldName => name -> sourceValues(fieldName)
      case (name, value) => name -> value
    }

    val args = updatedValues.values.toArray

    source.getClass.getConstructors.head.newInstance(args: _*).asInstanceOf[T]
  }

}
