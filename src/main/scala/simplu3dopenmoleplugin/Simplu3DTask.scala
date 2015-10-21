package simplu3dopenmoleplugin

import java.io.File
import fr.ign.cogit.simplu3d.openmole._

object Simplu3DTask {
  def apply(inputFolder: File, paramFile: File,
    idBPU: Int, distReculVoirie: Double, distReculFond: Double,
    distReculLat: Double, maximalCES: Double, hIniRoad: Double,
    slopeRoad: Double, hauteurMax: Double, seed: Long): (Double, Double, Long, File) = {
    val outputFoler = new File("/tmp/data_out")
    outputFoler.mkdir()
    val res = RunTask.run(inputFolder, outputFoler, paramFile, idBPU, distReculVoirie, distReculFond, distReculLat, maximalCES, hIniRoad, slopeRoad, hauteurMax, seed)
    (res.energy, res.coverageRatio, res.signature, outputFoler)
  }
}
