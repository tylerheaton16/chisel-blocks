package blocks

package object blocks {
  val firtoolOpts = Array(
    "-disable-all-randomization",
    "-strip-debug-info",
    "--disable-opt",
    "--split-verilog",
    "-o",
    "gen-collateral",
  )
}
