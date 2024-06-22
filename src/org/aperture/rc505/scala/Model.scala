package org.aperture.rc505.scala

import com.lucidchart.open.xtract.{XmlReader, __}
import com.lucidchart.open.xtract.XmlReader._

case class Memory (
                    track1: TRACK1,
                    track2: TRACK2,
                    track3: TRACK3,
                    track4: TRACK4,
                    track5: TRACK5,
                    rhythm: RHYTHM,
                    name: NAME,
                    master: MASTER,
                    rec_option: REC_OPTION,
                    play_option: PLAY_OPTION,
                    assign1: ASSIGN1,
                    assign2: ASSIGN2,
                    assign3: ASSIGN3,
                    assign4: ASSIGN4,
                    assign5: ASSIGN5,
                    assign6: ASSIGN6,
                    assign7: ASSIGN7,
                    assign8: ASSIGN8,
                    assign9: ASSIGN9,
                    assign10: ASSIGN10,
                    assign11: ASSIGN11,
                    assign12: ASSIGN12,
                    assign13: ASSIGN13,
                    assign14: ASSIGN14,
                    assign15: ASSIGN15,
                    assign16: ASSIGN16,
                    input_fx: INPUT_FX,
                    track_fx: TRACK_FX,
                    beat_fx1: BEAT_FX1,
                    beat_fx2: BEAT_FX2,
                    beat_fx3: BEAT_FX3,
                    input_fx1: INPUT_FX1,
                    input_fx2: INPUT_FX2,
                    input_fx3: INPUT_FX3,
                    track_fx1: TRACK_FX1,
                    track_fx2: TRACK_FX2,
                    track_fx3: TRACK_FX3,
                  )

object Memory{
  implicit val reader: XmlReader[Memory] = {
    for {
      track1 <- (__ \ "TRACK1").read[TRACK1]
      track2 <- (__ \ "TRACK2").read[TRACK2]
      track3 <- (__ \ "TRACK3").read[TRACK3]
      track4 <- (__ \ "TRACK4").read[TRACK4]
      track5 <- (__ \ "TRACK5").read[TRACK5]
      rhythm <- (__ \ "RHYTHM").read[RHYTHM]
      name <- (__ \ "NAME").read[NAME]
      master <- (__ \ "MASTER").read[MASTER]
      rec_option <- (__ \ "REC_OPTION").read[REC_OPTION]
      play_option <- (__ \ "PLAY_OPTION").read[PLAY_OPTION]
      assign1 <- (__ \ "ASSIGN1").read[ASSIGN1]
      assign2 <- (__ \ "ASSIGN2").read[ASSIGN2]
      assign3 <- (__ \ "ASSIGN3").read[ASSIGN3]
      assign4 <- (__ \ "ASSIGN4").read[ASSIGN4]
      assign5 <- (__ \ "ASSIGN5").read[ASSIGN5]
      assign6 <- (__ \ "ASSIGN6").read[ASSIGN6]
      assign7 <- (__ \ "ASSIGN7").read[ASSIGN7]
      assign8 <- (__ \ "ASSIGN8").read[ASSIGN8]
      assign9 <- (__ \ "ASSIGN9").read[ASSIGN9]
      assign10 <- (__ \ "ASSIGN10").read[ASSIGN10]
      assign11 <- (__ \ "ASSIGN11").read[ASSIGN11]
      assign12 <- (__ \ "ASSIGN12").read[ASSIGN12]
      assign13 <- (__ \ "ASSIGN13").read[ASSIGN13]
      assign14 <- (__ \ "ASSIGN14").read[ASSIGN14]
      assign15 <- (__ \ "ASSIGN15").read[ASSIGN15]
      assign16 <- (__ \ "ASSIGN16").read[ASSIGN16]
      input_fx <- (__ \ "INPUT_FX").read[INPUT_FX]
      track_fx <- (__ \ "TRACK_FX").read[TRACK_FX]
      beat_fx1 <- (__ \ "BEAT_FX1").read[BEAT_FX1]
      beat_fx2 <- (__ \ "BEAT_FX2").read[BEAT_FX2]
      beat_fx3 <- (__ \ "BEAT_FX3").read[BEAT_FX3]
      input_fx1 <- (__ \ "INPUT_FX1").read[INPUT_FX1]
      input_fx2 <- (__ \ "INPUT_FX2").read[INPUT_FX2]
      input_fx3 <- (__ \ "INPUT_FX3").read[INPUT_FX3]
      track_fx1 <- (__ \ "TRACK_FX1").read[TRACK_FX1]
      track_fx2 <- (__ \ "TRACK_FX2").read[TRACK_FX2]
      track_fx3 <- (__ \ "TRACK_FX3").read[TRACK_FX3]
    } yield Memory(track1,track2,track3,track4,track5,rhythm,name,master,rec_option,play_option,assign1,assign2,assign3,assign4,assign5,assign6,assign7,assign8,assign9,assign10,assign11,assign12,assign13,assign14,assign15,assign16,input_fx,track_fx,beat_fx1,beat_fx2,beat_fx3,input_fx1,input_fx2,input_fx3,track_fx1,track_fx2,track_fx3)
  }
}

case class TRACK1 (
                    Rev: Int,
                    PlyLvl: Int,
                    Pan: Int,
                    One: Int,
                    TrkFx: Int,
                    PlyMod: Int,
                    StrtMod: Int,
                    StpMod: Int,
                    MeasMod: Int,
                    MeasLen: Int,
                    MeasBtLp: Int,
                    LpSync: Int,
                    TmpSync: Int,
                    RecTmp: Int,
                    WavStat: Int,
                    WavLen: Int
                  )

object TRACK1{
  implicit val reader: XmlReader[TRACK1] = {
    for {
      rev <- (__ \ "Rev").read[Int]
      plylvl <- (__ \ "PlyLvl").read[Int]
      pan <- (__ \ "Pan").read[Int]
      one <- (__ \ "One").read[Int]
      trkfx <- (__ \ "TrkFx").read[Int]
      plymod <- (__ \ "PlyMod").read[Int]
      strtmod <- (__ \ "StrtMod").read[Int]
      stpmod <- (__ \ "StpMod").read[Int]
      measmod <- (__ \ "MeasMod").read[Int]
      measlen <- (__ \ "MeasLen").read[Int]
      measbtlp <- (__ \ "MeasBtLp").read[Int]
      lpsync <- (__ \ "LpSync").read[Int]
      tmpsync <- (__ \ "TmpSync").read[Int]
      rectmp <- (__ \ "RecTmp").read[Int]
      wavstat <- (__ \ "WavStat").read[Int]
      wavlen <- (__ \ "WavLen").read[Int]
    } yield TRACK1(rev,plylvl,pan,one,trkfx,plymod,strtmod,stpmod,measmod,measlen,measbtlp,lpsync,tmpsync,rectmp,wavstat,wavlen)
  }}

case class TRACK2 (
                    Rev: Int,
                    PlyLvl: Int,
                    Pan: Int,
                    One: Int,
                    TrkFx: Int,
                    PlyMod: Int,
                    StrtMod: Int,
                    StpMod: Int,
                    MeasMod: Int,
                    MeasLen: Int,
                    MeasBtLp: Int,
                    LpSync: Int,
                    TmpSync: Int,
                    RecTmp: Int,
                    WavStat: Int,
                    WavLen: Int
                  )

object TRACK2{
  implicit val reader: XmlReader[TRACK2] = {
    for {
      rev <- (__ \ "Rev").read[Int]
      plylvl <- (__ \ "PlyLvl").read[Int]
      pan <- (__ \ "Pan").read[Int]
      one <- (__ \ "One").read[Int]
      trkfx <- (__ \ "TrkFx").read[Int]
      plymod <- (__ \ "PlyMod").read[Int]
      strtmod <- (__ \ "StrtMod").read[Int]
      stpmod <- (__ \ "StpMod").read[Int]
      measmod <- (__ \ "MeasMod").read[Int]
      measlen <- (__ \ "MeasLen").read[Int]
      measbtlp <- (__ \ "MeasBtLp").read[Int]
      lpsync <- (__ \ "LpSync").read[Int]
      tmpsync <- (__ \ "TmpSync").read[Int]
      rectmp <- (__ \ "RecTmp").read[Int]
      wavstat <- (__ \ "WavStat").read[Int]
      wavlen <- (__ \ "WavLen").read[Int]
    } yield TRACK2(rev,plylvl,pan,one,trkfx,plymod,strtmod,stpmod,measmod,measlen,measbtlp,lpsync,tmpsync,rectmp,wavstat,wavlen)
  }}

case class TRACK3 (
                    Rev: Int,
                    PlyLvl: Int,
                    Pan: Int,
                    One: Int,
                    TrkFx: Int,
                    PlyMod: Int,
                    StrtMod: Int,
                    StpMod: Int,
                    MeasMod: Int,
                    MeasLen: Int,
                    MeasBtLp: Int,
                    LpSync: Int,
                    TmpSync: Int,
                    RecTmp: Int,
                    WavStat: Int,
                    WavLen: Int
                  )

object TRACK3{
  implicit val reader: XmlReader[TRACK3] = {
    for {
      rev <- (__ \ "Rev").read[Int]
      plylvl <- (__ \ "PlyLvl").read[Int]
      pan <- (__ \ "Pan").read[Int]
      one <- (__ \ "One").read[Int]
      trkfx <- (__ \ "TrkFx").read[Int]
      plymod <- (__ \ "PlyMod").read[Int]
      strtmod <- (__ \ "StrtMod").read[Int]
      stpmod <- (__ \ "StpMod").read[Int]
      measmod <- (__ \ "MeasMod").read[Int]
      measlen <- (__ \ "MeasLen").read[Int]
      measbtlp <- (__ \ "MeasBtLp").read[Int]
      lpsync <- (__ \ "LpSync").read[Int]
      tmpsync <- (__ \ "TmpSync").read[Int]
      rectmp <- (__ \ "RecTmp").read[Int]
      wavstat <- (__ \ "WavStat").read[Int]
      wavlen <- (__ \ "WavLen").read[Int]
    } yield TRACK3(rev,plylvl,pan,one,trkfx,plymod,strtmod,stpmod,measmod,measlen,measbtlp,lpsync,tmpsync,rectmp,wavstat,wavlen)
  }}

case class TRACK4 (
                    Rev: Int,
                    PlyLvl: Int,
                    Pan: Int,
                    One: Int,
                    TrkFx: Int,
                    PlyMod: Int,
                    StrtMod: Int,
                    StpMod: Int,
                    MeasMod: Int,
                    MeasLen: Int,
                    MeasBtLp: Int,
                    LpSync: Int,
                    TmpSync: Int,
                    RecTmp: Int,
                    WavStat: Int,
                    WavLen: Int
                  )

object TRACK4{
  implicit val reader: XmlReader[TRACK4] = {
    for {
      rev <- (__ \ "Rev").read[Int]
      plylvl <- (__ \ "PlyLvl").read[Int]
      pan <- (__ \ "Pan").read[Int]
      one <- (__ \ "One").read[Int]
      trkfx <- (__ \ "TrkFx").read[Int]
      plymod <- (__ \ "PlyMod").read[Int]
      strtmod <- (__ \ "StrtMod").read[Int]
      stpmod <- (__ \ "StpMod").read[Int]
      measmod <- (__ \ "MeasMod").read[Int]
      measlen <- (__ \ "MeasLen").read[Int]
      measbtlp <- (__ \ "MeasBtLp").read[Int]
      lpsync <- (__ \ "LpSync").read[Int]
      tmpsync <- (__ \ "TmpSync").read[Int]
      rectmp <- (__ \ "RecTmp").read[Int]
      wavstat <- (__ \ "WavStat").read[Int]
      wavlen <- (__ \ "WavLen").read[Int]
    } yield TRACK4(rev,plylvl,pan,one,trkfx,plymod,strtmod,stpmod,measmod,measlen,measbtlp,lpsync,tmpsync,rectmp,wavstat,wavlen)
  }}

case class TRACK5 (
                    Rev: Int,
                    PlyLvl: Int,
                    Pan: Int,
                    One: Int,
                    TrkFx: Int,
                    PlyMod: Int,
                    StrtMod: Int,
                    StpMod: Int,
                    MeasMod: Int,
                    MeasLen: Int,
                    MeasBtLp: Int,
                    LpSync: Int,
                    TmpSync: Int,
                    RecTmp: Int,
                    WavStat: Int,
                    WavLen: Int
                  )

object TRACK5{
  implicit val reader: XmlReader[TRACK5] = {
    for {
      rev <- (__ \ "Rev").read[Int]
      plylvl <- (__ \ "PlyLvl").read[Int]
      pan <- (__ \ "Pan").read[Int]
      one <- (__ \ "One").read[Int]
      trkfx <- (__ \ "TrkFx").read[Int]
      plymod <- (__ \ "PlyMod").read[Int]
      strtmod <- (__ \ "StrtMod").read[Int]
      stpmod <- (__ \ "StpMod").read[Int]
      measmod <- (__ \ "MeasMod").read[Int]
      measlen <- (__ \ "MeasLen").read[Int]
      measbtlp <- (__ \ "MeasBtLp").read[Int]
      lpsync <- (__ \ "LpSync").read[Int]
      tmpsync <- (__ \ "TmpSync").read[Int]
      rectmp <- (__ \ "RecTmp").read[Int]
      wavstat <- (__ \ "WavStat").read[Int]
      wavlen <- (__ \ "WavLen").read[Int]
    } yield TRACK5(rev,plylvl,pan,one,trkfx,plymod,strtmod,stpmod,measmod,measlen,measbtlp,lpsync,tmpsync,rectmp,wavstat,wavlen)
  }}

case class RHYTHM (
                    Sw: Int,
                    Lvl: Int,
                    Ptn: Int,
                    Bt: Int,
                    LineOut: Int,
                    RecCnt: Int,
                    PlyCnt: Int,
                    Stp: Int
                  )

object RHYTHM{
  implicit val reader: XmlReader[RHYTHM] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      lvl <- (__ \ "Lvl").read[Int]
      ptn <- (__ \ "Ptn").read[Int]
      bt <- (__ \ "Bt").read[Int]
      lineout <- (__ \ "LineOut").read[Int]
      reccnt <- (__ \ "RecCnt").read[Int]
      plycnt <- (__ \ "PlyCnt").read[Int]
      stp <- (__ \ "Stp").read[Int]
    } yield RHYTHM(sw,lvl,ptn,bt,lineout,reccnt,plycnt,stp)
  }}

case class NAME (
                  C01: Int,
                  C02: Int,
                  C03: Int,
                  C04: Int,
                  C05: Int,
                  C06: Int,
                  C07: Int,
                  C08: Int,
                  C09: Int,
                  C10: Int,
                  C11: Int,
                  C12: Int
                )

object NAME{
  implicit val reader: XmlReader[NAME] = {
    for {
      c01 <- (__ \ "C01").read[Int]
      c02 <- (__ \ "C02").read[Int]
      c03 <- (__ \ "C03").read[Int]
      c04 <- (__ \ "C04").read[Int]
      c05 <- (__ \ "C05").read[Int]
      c06 <- (__ \ "C06").read[Int]
      c07 <- (__ \ "C07").read[Int]
      c08 <- (__ \ "C08").read[Int]
      c09 <- (__ \ "C09").read[Int]
      c10 <- (__ \ "C10").read[Int]
      c11 <- (__ \ "C11").read[Int]
      c12 <- (__ \ "C12").read[Int]
    } yield NAME(c01,c02,c03,c04,c05,c06,c07,c08,c09,c10,c11,c12)
  }}

case class MASTER (
                    Lvl: Int,
                    Tmp: Int,
                    Cs: Int,
                    Rv: Int,
                    PhOut: Int,
                    PhOutTr: Int
                  )

object MASTER{
  implicit val reader: XmlReader[MASTER] = {
    for {
      lvl <- (__ \ "Lvl").read[Int]
      tmp <- (__ \ "Tmp").read[Int]
      cs <- (__ \ "Cs").read[Int]
      rv <- (__ \ "Rv").read[Int]
      phout <- (__ \ "PhOut").read[Int]
      phouttr <- (__ \ "PhOutTr").read[Int]
    } yield MASTER(lvl,tmp,cs,rv,phout,phouttr)
  }}

case class REC_OPTION (
                        DubMod: Int,
                        RecAct: Int,
                        RecQtz: Int
                      )

object REC_OPTION{
  implicit val reader: XmlReader[REC_OPTION] = {
    for {
      dubmod <- (__ \ "DubMod").read[Int]
      recact <- (__ \ "RecAct").read[Int]
      recqtz <- (__ \ "RecQtz").read[Int]
    } yield REC_OPTION(dubmod,recact,recqtz)
  }}

case class PLAY_OPTION (
                         SinglePlyChg: Int,
                         LpQtz: Int,
                         LpMod: Int,
                         LpLen: Int,
                         AllStrt: Int,
                         AllStp: Int,
                         FadeTim: Int,
                         TgtTr: Int
                       )

object PLAY_OPTION{
  implicit val reader: XmlReader[PLAY_OPTION] = {
    for {
      singleplychg <- (__ \ "SinglePlyChg").read[Int]
      lpqtz <- (__ \ "LpQtz").read[Int]
      lpmod <- (__ \ "LpMod").read[Int]
      lplen <- (__ \ "LpLen").read[Int]
      allstrt <- (__ \ "AllStrt").read[Int]
      allstp <- (__ \ "AllStp").read[Int]
      fadetim <- (__ \ "FadeTim").read[Int]
      tgttr <- (__ \ "TgtTr").read[Int]
    } yield PLAY_OPTION(singleplychg,lpqtz,lpmod,lplen,allstrt,allstp,fadetim,tgttr)
  }}

case class ASSIGN1 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN1{
  implicit val reader: XmlReader[ASSIGN1] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN1(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN2 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN2{
  implicit val reader: XmlReader[ASSIGN2] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN2(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN3 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN3{
  implicit val reader: XmlReader[ASSIGN3] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN3(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN4 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN4{
  implicit val reader: XmlReader[ASSIGN4] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN4(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN5 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN5{
  implicit val reader: XmlReader[ASSIGN5] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN5(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN6 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN6{
  implicit val reader: XmlReader[ASSIGN6] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN6(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN7 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN7{
  implicit val reader: XmlReader[ASSIGN7] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN7(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN8 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN8{
  implicit val reader: XmlReader[ASSIGN8] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN8(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN9 (
                     Sw: Int,
                     Src: Int,
                     SrcMod: Int,
                     Tgt: Int,
                     TgtMin: Int,
                     TgtMax: Int
                   )

object ASSIGN9{
  implicit val reader: XmlReader[ASSIGN9] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN9(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN10 (
                      Sw: Int,
                      Src: Int,
                      SrcMod: Int,
                      Tgt: Int,
                      TgtMin: Int,
                      TgtMax: Int
                    )

object ASSIGN10{
  implicit val reader: XmlReader[ASSIGN10] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN10(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN11 (
                      Sw: Int,
                      Src: Int,
                      SrcMod: Int,
                      Tgt: Int,
                      TgtMin: Int,
                      TgtMax: Int
                    )

object ASSIGN11{
  implicit val reader: XmlReader[ASSIGN11] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN11(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN12 (
                      Sw: Int,
                      Src: Int,
                      SrcMod: Int,
                      Tgt: Int,
                      TgtMin: Int,
                      TgtMax: Int
                    )

object ASSIGN12{
  implicit val reader: XmlReader[ASSIGN12] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN12(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN13 (
                      Sw: Int,
                      Src: Int,
                      SrcMod: Int,
                      Tgt: Int,
                      TgtMin: Int,
                      TgtMax: Int
                    )

object ASSIGN13{
  implicit val reader: XmlReader[ASSIGN13] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN13(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN14 (
                      Sw: Int,
                      Src: Int,
                      SrcMod: Int,
                      Tgt: Int,
                      TgtMin: Int,
                      TgtMax: Int
                    )

object ASSIGN14{
  implicit val reader: XmlReader[ASSIGN14] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN14(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN15 (
                      Sw: Int,
                      Src: Int,
                      SrcMod: Int,
                      Tgt: Int,
                      TgtMin: Int,
                      TgtMax: Int
                    )

object ASSIGN15{
  implicit val reader: XmlReader[ASSIGN15] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN15(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class ASSIGN16 (
                      Sw: Int,
                      Src: Int,
                      SrcMod: Int,
                      Tgt: Int,
                      TgtMin: Int,
                      TgtMax: Int
                    )

object ASSIGN16{
  implicit val reader: XmlReader[ASSIGN16] = {
    for {
      sw <- (__ \ "Sw").read[Int]
      src <- (__ \ "Src").read[Int]
      srcmod <- (__ \ "SrcMod").read[Int]
      tgt <- (__ \ "Tgt").read[Int]
      tgtmin <- (__ \ "TgtMin").read[Int]
      tgtmax <- (__ \ "TgtMax").read[Int]
    } yield ASSIGN16(sw,src,srcmod,tgt,tgtmin,tgtmax)
  }}

case class INPUT_FX (
                      Mod: Int,
                      MltMod: Int,
                      Sw: Int,
                      Sel: Int,
                      Typ1: Int,
                      Typ2: Int,
                      Typ3: Int,
                      MltSw: Int,
                      MltTyp1: Int,
                      MltTyp2: Int,
                      MltTyp3: Int
                    )

object INPUT_FX{
  implicit val reader: XmlReader[INPUT_FX] = {
    for {
      mod <- (__ \ "Mod").read[Int]
      mltmod <- (__ \ "MltMod").read[Int]
      sw <- (__ \ "Sw").read[Int]
      sel <- (__ \ "Sel").read[Int]
      typ1 <- (__ \ "Typ1").read[Int]
      typ2 <- (__ \ "Typ2").read[Int]
      typ3 <- (__ \ "Typ3").read[Int]
      mltsw <- (__ \ "MltSw").read[Int]
      mlttyp1 <- (__ \ "MltTyp1").read[Int]
      mlttyp2 <- (__ \ "MltTyp2").read[Int]
      mlttyp3 <- (__ \ "MltTyp3").read[Int]
    } yield INPUT_FX(mod,mltmod,sw,sel,typ1,typ2,typ3,mltsw,mlttyp1,mlttyp2,mlttyp3)
  }}

case class TRACK_FX (
                      Mod: Int,
                      MltMod: Int,
                      Sw: Int,
                      Sel: Int,
                      Typ1: Int,
                      Typ2: Int,
                      Typ3: Int,
                      MltSw: Int,
                      MltTyp1: Int,
                      MltTyp2: Int,
                      MltTyp3: Int
                    )

object TRACK_FX{
  implicit val reader: XmlReader[TRACK_FX] = {
    for {
      mod <- (__ \ "Mod").read[Int]
      mltmod <- (__ \ "MltMod").read[Int]
      sw <- (__ \ "Sw").read[Int]
      sel <- (__ \ "Sel").read[Int]
      typ1 <- (__ \ "Typ1").read[Int]
      typ2 <- (__ \ "Typ2").read[Int]
      typ3 <- (__ \ "Typ3").read[Int]
      mltsw <- (__ \ "MltSw").read[Int]
      mlttyp1 <- (__ \ "MltTyp1").read[Int]
      mlttyp2 <- (__ \ "MltTyp2").read[Int]
      mlttyp3 <- (__ \ "MltTyp3").read[Int]
    } yield TRACK_FX(mod,mltmod,sw,sel,typ1,typ2,typ3,mltsw,mlttyp1,mlttyp2,mlttyp3)
  }}

case class BEAT_FX1 (
                      RepTyp: Int,
                      RepLen: Int,
                      ShftTyp: Int,
                      ShftShft: Int,
                      ScatTyp: Int,
                      ScatLen: Int,
                      Flick: Int
                    )

object BEAT_FX1{
  implicit val reader: XmlReader[BEAT_FX1] = {
    for {
      reptyp <- (__ \ "RepTyp").read[Int]
      replen <- (__ \ "RepLen").read[Int]
      shfttyp <- (__ \ "ShftTyp").read[Int]
      shftshft <- (__ \ "ShftShft").read[Int]
      scattyp <- (__ \ "ScatTyp").read[Int]
      scatlen <- (__ \ "ScatLen").read[Int]
      flick <- (__ \ "Flick").read[Int]
    } yield BEAT_FX1(reptyp,replen,shfttyp,shftshft,scattyp,scatlen,flick)
  }}

case class BEAT_FX2 (
                      RepTyp: Int,
                      RepLen: Int,
                      ShftTyp: Int,
                      ShftShft: Int,
                      ScatTyp: Int,
                      ScatLen: Int,
                      Flick: Int
                    )

object BEAT_FX2{
  implicit val reader: XmlReader[BEAT_FX2] = {
    for {
      reptyp <- (__ \ "RepTyp").read[Int]
      replen <- (__ \ "RepLen").read[Int]
      shfttyp <- (__ \ "ShftTyp").read[Int]
      shftshft <- (__ \ "ShftShft").read[Int]
      scattyp <- (__ \ "ScatTyp").read[Int]
      scatlen <- (__ \ "ScatLen").read[Int]
      flick <- (__ \ "Flick").read[Int]
    } yield BEAT_FX2(reptyp,replen,shfttyp,shftshft,scattyp,scatlen,flick)
  }}

case class BEAT_FX3 (
                      RepTyp: Int,
                      RepLen: Int,
                      ShftTyp: Int,
                      ShftShft: Int,
                      ScatTyp: Int,
                      ScatLen: Int,
                      Flick: Int
                    )

object BEAT_FX3{
  implicit val reader: XmlReader[BEAT_FX3] = {
    for {
      reptyp <- (__ \ "RepTyp").read[Int]
      replen <- (__ \ "RepLen").read[Int]
      shfttyp <- (__ \ "ShftTyp").read[Int]
      shftshft <- (__ \ "ShftShft").read[Int]
      scattyp <- (__ \ "ScatTyp").read[Int]
      scatlen <- (__ \ "ScatLen").read[Int]
      flick <- (__ \ "Flick").read[Int]
    } yield BEAT_FX3(reptyp,replen,shfttyp,shftshft,scattyp,scatlen,flick)
  }}

case class INPUT_FX1 (
                       FilTyp: Int,
                       FilRat: Int,
                       FilDep: Int,
                       FilReso: Int,
                       FilCut: Int,
                       FilStpRat: Int,
                       PhRat: Int,
                       PhDep: Int,
                       PhReso: Int,
                       PhStpRat: Int,
                       PhLvl: Int,
                       FlRat: Int,
                       FlDep: Int,
                       FlReso: Int,
                       FlStpRat: Int,
                       FlLvl: Int,
                       SynFreq: Int,
                       SynReso: Int,
                       SynDecay: Int,
                       SynBal: Int,
                       LoFiDep: Int,
                       LoFiSmpl: Int,
                       LoFiBal: Int,
                       RmFreq: Int,
                       RmBal: Int,
                       GToB: Int,
                       SgSens: Int,
                       SgRisTim: Int,
                       SgLvl: Int,
                       Trans: Int,
                       PbPit: Int,
                       PbBnd: Int,
                       RoboNote: Int,
                       RoboGen: Int,
                       DistDist: Int,
                       DistTon: Int,
                       DistLvl: Int,
                       VocoCar: Int,
                       VocoSens: Int,
                       VocoAtck: Int,
                       VocoBal: Int,
                       DynmTyp: Int,
                       DynmDynm: Int,
                       EqLo: Int,
                       EqLoMd: Int,
                       EqHiMd: Int,
                       EqHi: Int,
                       EqLvl: Int,
                       IsoBnd: Int,
                       IsoRat: Int,
                       IsoDep: Int,
                       IsoStpRat: Int,
                       IsoLvl: Int,
                       OctMod: Int,
                       OctLvl: Int,
                       PanTyp: Int,
                       PanRat: Int,
                       PanDep: Int,
                       PanStpRat: Int,
                       PanPos: Int,
                       TrRat: Int,
                       TrDep: Int,
                       TrLvl: Int,
                       SlPat: Int,
                       SlRat: Int,
                       SlDep: Int,
                       DlyTim: Int,
                       DlyFb: Int,
                       DlyLvl: Int,
                       PanDlyTim: Int,
                       PanDlyFb: Int,
                       PanDlyLvl: Int,
                       EchRat: Int,
                       EchInt: Int,
                       EchLvl: Int,
                       GraTim: Int,
                       GraFb: Int,
                       GraLvl: Int,
                       RllTim: Int,
                       RllMod: Int,
                       RllFb: Int,
                       RllLvl: Int,
                       ChoRat: Int,
                       ChoDep: Int,
                       ChoLvl: Int,
                       RevTim: Int,
                       RevLvl: Int,
                       RevDLvl: Int
                     )

object INPUT_FX1{
  implicit val reader: XmlReader[INPUT_FX1] = {
    for {
      filtyp <- (__ \ "FilTyp").read[Int]
      filrat <- (__ \ "FilRat").read[Int]
      fildep <- (__ \ "FilDep").read[Int]
      filreso <- (__ \ "FilReso").read[Int]
      filcut <- (__ \ "FilCut").read[Int]
      filstprat <- (__ \ "FilStpRat").read[Int]
      phrat <- (__ \ "PhRat").read[Int]
      phdep <- (__ \ "PhDep").read[Int]
      phreso <- (__ \ "PhReso").read[Int]
      phstprat <- (__ \ "PhStpRat").read[Int]
      phlvl <- (__ \ "PhLvl").read[Int]
      flrat <- (__ \ "FlRat").read[Int]
      fldep <- (__ \ "FlDep").read[Int]
      flreso <- (__ \ "FlReso").read[Int]
      flstprat <- (__ \ "FlStpRat").read[Int]
      fllvl <- (__ \ "FlLvl").read[Int]
      synfreq <- (__ \ "SynFreq").read[Int]
      synreso <- (__ \ "SynReso").read[Int]
      syndecay <- (__ \ "SynDecay").read[Int]
      synbal <- (__ \ "SynBal").read[Int]
      lofidep <- (__ \ "LoFiDep").read[Int]
      lofismpl <- (__ \ "LoFiSmpl").read[Int]
      lofibal <- (__ \ "LoFiBal").read[Int]
      rmfreq <- (__ \ "RmFreq").read[Int]
      rmbal <- (__ \ "RmBal").read[Int]
      gtob <- (__ \ "GToB").read[Int]
      sgsens <- (__ \ "SgSens").read[Int]
      sgristim <- (__ \ "SgRisTim").read[Int]
      sglvl <- (__ \ "SgLvl").read[Int]
      trans <- (__ \ "Trans").read[Int]
      pbpit <- (__ \ "PbPit").read[Int]
      pbbnd <- (__ \ "PbBnd").read[Int]
      robonote <- (__ \ "RoboNote").read[Int]
      robogen <- (__ \ "RoboGen").read[Int]
      distdist <- (__ \ "DistDist").read[Int]
      distton <- (__ \ "DistTon").read[Int]
      distlvl <- (__ \ "DistLvl").read[Int]
      vococar <- (__ \ "VocoCar").read[Int]
      vocosens <- (__ \ "VocoSens").read[Int]
      vocoatck <- (__ \ "VocoAtck").read[Int]
      vocobal <- (__ \ "VocoBal").read[Int]
      dynmtyp <- (__ \ "DynmTyp").read[Int]
      dynmdynm <- (__ \ "DynmDynm").read[Int]
      eqlo <- (__ \ "EqLo").read[Int]
      eqlomd <- (__ \ "EqLoMd").read[Int]
      eqhimd <- (__ \ "EqHiMd").read[Int]
      eqhi <- (__ \ "EqHi").read[Int]
      eqlvl <- (__ \ "EqLvl").read[Int]
      isobnd <- (__ \ "IsoBnd").read[Int]
      isorat <- (__ \ "IsoRat").read[Int]
      isodep <- (__ \ "IsoDep").read[Int]
      isostprat <- (__ \ "IsoStpRat").read[Int]
      isolvl <- (__ \ "IsoLvl").read[Int]
      octmod <- (__ \ "OctMod").read[Int]
      octlvl <- (__ \ "OctLvl").read[Int]
      pantyp <- (__ \ "PanTyp").read[Int]
      panrat <- (__ \ "PanRat").read[Int]
      pandep <- (__ \ "PanDep").read[Int]
      panstprat <- (__ \ "PanStpRat").read[Int]
      panpos <- (__ \ "PanPos").read[Int]
      trrat <- (__ \ "TrRat").read[Int]
      trdep <- (__ \ "TrDep").read[Int]
      trlvl <- (__ \ "TrLvl").read[Int]
      slpat <- (__ \ "SlPat").read[Int]
      slrat <- (__ \ "SlRat").read[Int]
      sldep <- (__ \ "SlDep").read[Int]
      dlytim <- (__ \ "DlyTim").read[Int]
      dlyfb <- (__ \ "DlyFb").read[Int]
      dlylvl <- (__ \ "DlyLvl").read[Int]
      pandlytim <- (__ \ "PanDlyTim").read[Int]
      pandlyfb <- (__ \ "PanDlyFb").read[Int]
      pandlylvl <- (__ \ "PanDlyLvl").read[Int]
      echrat <- (__ \ "EchRat").read[Int]
      echint <- (__ \ "EchInt").read[Int]
      echlvl <- (__ \ "EchLvl").read[Int]
      gratim <- (__ \ "GraTim").read[Int]
      grafb <- (__ \ "GraFb").read[Int]
      gralvl <- (__ \ "GraLvl").read[Int]
      rlltim <- (__ \ "RllTim").read[Int]
      rllmod <- (__ \ "RllMod").read[Int]
      rllfb <- (__ \ "RllFb").read[Int]
      rlllvl <- (__ \ "RllLvl").read[Int]
      chorat <- (__ \ "ChoRat").read[Int]
      chodep <- (__ \ "ChoDep").read[Int]
      cholvl <- (__ \ "ChoLvl").read[Int]
      revtim <- (__ \ "RevTim").read[Int]
      revlvl <- (__ \ "RevLvl").read[Int]
      revdlvl <- (__ \ "RevDLvl").read[Int]
    } yield INPUT_FX1(filtyp,filrat,fildep,filreso,filcut,filstprat,phrat,phdep,phreso,phstprat,phlvl,flrat,fldep,flreso,flstprat,fllvl,synfreq,synreso,syndecay,synbal,lofidep,lofismpl,lofibal,rmfreq,rmbal,gtob,sgsens,sgristim,sglvl,trans,pbpit,pbbnd,robonote,robogen,distdist,distton,distlvl,vococar,vocosens,vocoatck,vocobal,dynmtyp,dynmdynm,eqlo,eqlomd,eqhimd,eqhi,eqlvl,isobnd,isorat,isodep,isostprat,isolvl,octmod,octlvl,pantyp,panrat,pandep,panstprat,panpos,trrat,trdep,trlvl,slpat,slrat,sldep,dlytim,dlyfb,dlylvl,pandlytim,pandlyfb,pandlylvl,echrat,echint,echlvl,gratim,grafb,gralvl,rlltim,rllmod,rllfb,rlllvl,chorat,chodep,cholvl,revtim,revlvl,revdlvl)
  }}

case class INPUT_FX2 (
                       FilTyp: Int,
                       FilRat: Int,
                       FilDep: Int,
                       FilReso: Int,
                       FilCut: Int,
                       FilStpRat: Int,
                       PhRat: Int,
                       PhDep: Int,
                       PhReso: Int,
                       PhStpRat: Int,
                       PhLvl: Int,
                       FlRat: Int,
                       FlDep: Int,
                       FlReso: Int,
                       FlStpRat: Int,
                       FlLvl: Int,
                       SynFreq: Int,
                       SynReso: Int,
                       SynDecay: Int,
                       SynBal: Int,
                       LoFiDep: Int,
                       LoFiSmpl: Int,
                       LoFiBal: Int,
                       RmFreq: Int,
                       RmBal: Int,
                       GToB: Int,
                       SgSens: Int,
                       SgRisTim: Int,
                       SgLvl: Int,
                       Trans: Int,
                       PbPit: Int,
                       PbBnd: Int,
                       RoboNote: Int,
                       RoboGen: Int,
                       DistDist: Int,
                       DistTon: Int,
                       DistLvl: Int,
                       VocoCar: Int,
                       VocoSens: Int,
                       VocoAtck: Int,
                       VocoBal: Int,
                       DynmTyp: Int,
                       DynmDynm: Int,
                       EqLo: Int,
                       EqLoMd: Int,
                       EqHiMd: Int,
                       EqHi: Int,
                       EqLvl: Int,
                       IsoBnd: Int,
                       IsoRat: Int,
                       IsoDep: Int,
                       IsoStpRat: Int,
                       IsoLvl: Int,
                       OctMod: Int,
                       OctLvl: Int,
                       PanTyp: Int,
                       PanRat: Int,
                       PanDep: Int,
                       PanStpRat: Int,
                       PanPos: Int,
                       TrRat: Int,
                       TrDep: Int,
                       TrLvl: Int,
                       SlPat: Int,
                       SlRat: Int,
                       SlDep: Int,
                       DlyTim: Int,
                       DlyFb: Int,
                       DlyLvl: Int,
                       PanDlyTim: Int,
                       PanDlyFb: Int,
                       PanDlyLvl: Int,
                       EchRat: Int,
                       EchInt: Int,
                       EchLvl: Int,
                       GraTim: Int,
                       GraFb: Int,
                       GraLvl: Int,
                       RllTim: Int,
                       RllMod: Int,
                       RllFb: Int,
                       RllLvl: Int,
                       ChoRat: Int,
                       ChoDep: Int,
                       ChoLvl: Int,
                       RevTim: Int,
                       RevLvl: Int,
                       RevDLvl: Int
                     )

object INPUT_FX2{
  implicit val reader: XmlReader[INPUT_FX2] = {
    for {
      filtyp <- (__ \ "FilTyp").read[Int]
      filrat <- (__ \ "FilRat").read[Int]
      fildep <- (__ \ "FilDep").read[Int]
      filreso <- (__ \ "FilReso").read[Int]
      filcut <- (__ \ "FilCut").read[Int]
      filstprat <- (__ \ "FilStpRat").read[Int]
      phrat <- (__ \ "PhRat").read[Int]
      phdep <- (__ \ "PhDep").read[Int]
      phreso <- (__ \ "PhReso").read[Int]
      phstprat <- (__ \ "PhStpRat").read[Int]
      phlvl <- (__ \ "PhLvl").read[Int]
      flrat <- (__ \ "FlRat").read[Int]
      fldep <- (__ \ "FlDep").read[Int]
      flreso <- (__ \ "FlReso").read[Int]
      flstprat <- (__ \ "FlStpRat").read[Int]
      fllvl <- (__ \ "FlLvl").read[Int]
      synfreq <- (__ \ "SynFreq").read[Int]
      synreso <- (__ \ "SynReso").read[Int]
      syndecay <- (__ \ "SynDecay").read[Int]
      synbal <- (__ \ "SynBal").read[Int]
      lofidep <- (__ \ "LoFiDep").read[Int]
      lofismpl <- (__ \ "LoFiSmpl").read[Int]
      lofibal <- (__ \ "LoFiBal").read[Int]
      rmfreq <- (__ \ "RmFreq").read[Int]
      rmbal <- (__ \ "RmBal").read[Int]
      gtob <- (__ \ "GToB").read[Int]
      sgsens <- (__ \ "SgSens").read[Int]
      sgristim <- (__ \ "SgRisTim").read[Int]
      sglvl <- (__ \ "SgLvl").read[Int]
      trans <- (__ \ "Trans").read[Int]
      pbpit <- (__ \ "PbPit").read[Int]
      pbbnd <- (__ \ "PbBnd").read[Int]
      robonote <- (__ \ "RoboNote").read[Int]
      robogen <- (__ \ "RoboGen").read[Int]
      distdist <- (__ \ "DistDist").read[Int]
      distton <- (__ \ "DistTon").read[Int]
      distlvl <- (__ \ "DistLvl").read[Int]
      vococar <- (__ \ "VocoCar").read[Int]
      vocosens <- (__ \ "VocoSens").read[Int]
      vocoatck <- (__ \ "VocoAtck").read[Int]
      vocobal <- (__ \ "VocoBal").read[Int]
      dynmtyp <- (__ \ "DynmTyp").read[Int]
      dynmdynm <- (__ \ "DynmDynm").read[Int]
      eqlo <- (__ \ "EqLo").read[Int]
      eqlomd <- (__ \ "EqLoMd").read[Int]
      eqhimd <- (__ \ "EqHiMd").read[Int]
      eqhi <- (__ \ "EqHi").read[Int]
      eqlvl <- (__ \ "EqLvl").read[Int]
      isobnd <- (__ \ "IsoBnd").read[Int]
      isorat <- (__ \ "IsoRat").read[Int]
      isodep <- (__ \ "IsoDep").read[Int]
      isostprat <- (__ \ "IsoStpRat").read[Int]
      isolvl <- (__ \ "IsoLvl").read[Int]
      octmod <- (__ \ "OctMod").read[Int]
      octlvl <- (__ \ "OctLvl").read[Int]
      pantyp <- (__ \ "PanTyp").read[Int]
      panrat <- (__ \ "PanRat").read[Int]
      pandep <- (__ \ "PanDep").read[Int]
      panstprat <- (__ \ "PanStpRat").read[Int]
      panpos <- (__ \ "PanPos").read[Int]
      trrat <- (__ \ "TrRat").read[Int]
      trdep <- (__ \ "TrDep").read[Int]
      trlvl <- (__ \ "TrLvl").read[Int]
      slpat <- (__ \ "SlPat").read[Int]
      slrat <- (__ \ "SlRat").read[Int]
      sldep <- (__ \ "SlDep").read[Int]
      dlytim <- (__ \ "DlyTim").read[Int]
      dlyfb <- (__ \ "DlyFb").read[Int]
      dlylvl <- (__ \ "DlyLvl").read[Int]
      pandlytim <- (__ \ "PanDlyTim").read[Int]
      pandlyfb <- (__ \ "PanDlyFb").read[Int]
      pandlylvl <- (__ \ "PanDlyLvl").read[Int]
      echrat <- (__ \ "EchRat").read[Int]
      echint <- (__ \ "EchInt").read[Int]
      echlvl <- (__ \ "EchLvl").read[Int]
      gratim <- (__ \ "GraTim").read[Int]
      grafb <- (__ \ "GraFb").read[Int]
      gralvl <- (__ \ "GraLvl").read[Int]
      rlltim <- (__ \ "RllTim").read[Int]
      rllmod <- (__ \ "RllMod").read[Int]
      rllfb <- (__ \ "RllFb").read[Int]
      rlllvl <- (__ \ "RllLvl").read[Int]
      chorat <- (__ \ "ChoRat").read[Int]
      chodep <- (__ \ "ChoDep").read[Int]
      cholvl <- (__ \ "ChoLvl").read[Int]
      revtim <- (__ \ "RevTim").read[Int]
      revlvl <- (__ \ "RevLvl").read[Int]
      revdlvl <- (__ \ "RevDLvl").read[Int]
    } yield INPUT_FX2(filtyp,filrat,fildep,filreso,filcut,filstprat,phrat,phdep,phreso,phstprat,phlvl,flrat,fldep,flreso,flstprat,fllvl,synfreq,synreso,syndecay,synbal,lofidep,lofismpl,lofibal,rmfreq,rmbal,gtob,sgsens,sgristim,sglvl,trans,pbpit,pbbnd,robonote,robogen,distdist,distton,distlvl,vococar,vocosens,vocoatck,vocobal,dynmtyp,dynmdynm,eqlo,eqlomd,eqhimd,eqhi,eqlvl,isobnd,isorat,isodep,isostprat,isolvl,octmod,octlvl,pantyp,panrat,pandep,panstprat,panpos,trrat,trdep,trlvl,slpat,slrat,sldep,dlytim,dlyfb,dlylvl,pandlytim,pandlyfb,pandlylvl,echrat,echint,echlvl,gratim,grafb,gralvl,rlltim,rllmod,rllfb,rlllvl,chorat,chodep,cholvl,revtim,revlvl,revdlvl)
  }}

case class INPUT_FX3 (
                       FilTyp: Int,
                       FilRat: Int,
                       FilDep: Int,
                       FilReso: Int,
                       FilCut: Int,
                       FilStpRat: Int,
                       PhRat: Int,
                       PhDep: Int,
                       PhReso: Int,
                       PhStpRat: Int,
                       PhLvl: Int,
                       FlRat: Int,
                       FlDep: Int,
                       FlReso: Int,
                       FlStpRat: Int,
                       FlLvl: Int,
                       SynFreq: Int,
                       SynReso: Int,
                       SynDecay: Int,
                       SynBal: Int,
                       LoFiDep: Int,
                       LoFiSmpl: Int,
                       LoFiBal: Int,
                       RmFreq: Int,
                       RmBal: Int,
                       GToB: Int,
                       SgSens: Int,
                       SgRisTim: Int,
                       SgLvl: Int,
                       Trans: Int,
                       PbPit: Int,
                       PbBnd: Int,
                       RoboNote: Int,
                       RoboGen: Int,
                       DistDist: Int,
                       DistTon: Int,
                       DistLvl: Int,
                       VocoCar: Int,
                       VocoSens: Int,
                       VocoAtck: Int,
                       VocoBal: Int,
                       DynmTyp: Int,
                       DynmDynm: Int,
                       EqLo: Int,
                       EqLoMd: Int,
                       EqHiMd: Int,
                       EqHi: Int,
                       EqLvl: Int,
                       IsoBnd: Int,
                       IsoRat: Int,
                       IsoDep: Int,
                       IsoStpRat: Int,
                       IsoLvl: Int,
                       OctMod: Int,
                       OctLvl: Int,
                       PanTyp: Int,
                       PanRat: Int,
                       PanDep: Int,
                       PanStpRat: Int,
                       PanPos: Int,
                       TrRat: Int,
                       TrDep: Int,
                       TrLvl: Int,
                       SlPat: Int,
                       SlRat: Int,
                       SlDep: Int,
                       DlyTim: Int,
                       DlyFb: Int,
                       DlyLvl: Int,
                       PanDlyTim: Int,
                       PanDlyFb: Int,
                       PanDlyLvl: Int,
                       EchRat: Int,
                       EchInt: Int,
                       EchLvl: Int,
                       GraTim: Int,
                       GraFb: Int,
                       GraLvl: Int,
                       RllTim: Int,
                       RllMod: Int,
                       RllFb: Int,
                       RllLvl: Int,
                       ChoRat: Int,
                       ChoDep: Int,
                       ChoLvl: Int,
                       RevTim: Int,
                       RevLvl: Int,
                       RevDLvl: Int
                     )

object INPUT_FX3{
  implicit val reader: XmlReader[INPUT_FX3] = {
    for {
      filtyp <- (__ \ "FilTyp").read[Int]
      filrat <- (__ \ "FilRat").read[Int]
      fildep <- (__ \ "FilDep").read[Int]
      filreso <- (__ \ "FilReso").read[Int]
      filcut <- (__ \ "FilCut").read[Int]
      filstprat <- (__ \ "FilStpRat").read[Int]
      phrat <- (__ \ "PhRat").read[Int]
      phdep <- (__ \ "PhDep").read[Int]
      phreso <- (__ \ "PhReso").read[Int]
      phstprat <- (__ \ "PhStpRat").read[Int]
      phlvl <- (__ \ "PhLvl").read[Int]
      flrat <- (__ \ "FlRat").read[Int]
      fldep <- (__ \ "FlDep").read[Int]
      flreso <- (__ \ "FlReso").read[Int]
      flstprat <- (__ \ "FlStpRat").read[Int]
      fllvl <- (__ \ "FlLvl").read[Int]
      synfreq <- (__ \ "SynFreq").read[Int]
      synreso <- (__ \ "SynReso").read[Int]
      syndecay <- (__ \ "SynDecay").read[Int]
      synbal <- (__ \ "SynBal").read[Int]
      lofidep <- (__ \ "LoFiDep").read[Int]
      lofismpl <- (__ \ "LoFiSmpl").read[Int]
      lofibal <- (__ \ "LoFiBal").read[Int]
      rmfreq <- (__ \ "RmFreq").read[Int]
      rmbal <- (__ \ "RmBal").read[Int]
      gtob <- (__ \ "GToB").read[Int]
      sgsens <- (__ \ "SgSens").read[Int]
      sgristim <- (__ \ "SgRisTim").read[Int]
      sglvl <- (__ \ "SgLvl").read[Int]
      trans <- (__ \ "Trans").read[Int]
      pbpit <- (__ \ "PbPit").read[Int]
      pbbnd <- (__ \ "PbBnd").read[Int]
      robonote <- (__ \ "RoboNote").read[Int]
      robogen <- (__ \ "RoboGen").read[Int]
      distdist <- (__ \ "DistDist").read[Int]
      distton <- (__ \ "DistTon").read[Int]
      distlvl <- (__ \ "DistLvl").read[Int]
      vococar <- (__ \ "VocoCar").read[Int]
      vocosens <- (__ \ "VocoSens").read[Int]
      vocoatck <- (__ \ "VocoAtck").read[Int]
      vocobal <- (__ \ "VocoBal").read[Int]
      dynmtyp <- (__ \ "DynmTyp").read[Int]
      dynmdynm <- (__ \ "DynmDynm").read[Int]
      eqlo <- (__ \ "EqLo").read[Int]
      eqlomd <- (__ \ "EqLoMd").read[Int]
      eqhimd <- (__ \ "EqHiMd").read[Int]
      eqhi <- (__ \ "EqHi").read[Int]
      eqlvl <- (__ \ "EqLvl").read[Int]
      isobnd <- (__ \ "IsoBnd").read[Int]
      isorat <- (__ \ "IsoRat").read[Int]
      isodep <- (__ \ "IsoDep").read[Int]
      isostprat <- (__ \ "IsoStpRat").read[Int]
      isolvl <- (__ \ "IsoLvl").read[Int]
      octmod <- (__ \ "OctMod").read[Int]
      octlvl <- (__ \ "OctLvl").read[Int]
      pantyp <- (__ \ "PanTyp").read[Int]
      panrat <- (__ \ "PanRat").read[Int]
      pandep <- (__ \ "PanDep").read[Int]
      panstprat <- (__ \ "PanStpRat").read[Int]
      panpos <- (__ \ "PanPos").read[Int]
      trrat <- (__ \ "TrRat").read[Int]
      trdep <- (__ \ "TrDep").read[Int]
      trlvl <- (__ \ "TrLvl").read[Int]
      slpat <- (__ \ "SlPat").read[Int]
      slrat <- (__ \ "SlRat").read[Int]
      sldep <- (__ \ "SlDep").read[Int]
      dlytim <- (__ \ "DlyTim").read[Int]
      dlyfb <- (__ \ "DlyFb").read[Int]
      dlylvl <- (__ \ "DlyLvl").read[Int]
      pandlytim <- (__ \ "PanDlyTim").read[Int]
      pandlyfb <- (__ \ "PanDlyFb").read[Int]
      pandlylvl <- (__ \ "PanDlyLvl").read[Int]
      echrat <- (__ \ "EchRat").read[Int]
      echint <- (__ \ "EchInt").read[Int]
      echlvl <- (__ \ "EchLvl").read[Int]
      gratim <- (__ \ "GraTim").read[Int]
      grafb <- (__ \ "GraFb").read[Int]
      gralvl <- (__ \ "GraLvl").read[Int]
      rlltim <- (__ \ "RllTim").read[Int]
      rllmod <- (__ \ "RllMod").read[Int]
      rllfb <- (__ \ "RllFb").read[Int]
      rlllvl <- (__ \ "RllLvl").read[Int]
      chorat <- (__ \ "ChoRat").read[Int]
      chodep <- (__ \ "ChoDep").read[Int]
      cholvl <- (__ \ "ChoLvl").read[Int]
      revtim <- (__ \ "RevTim").read[Int]
      revlvl <- (__ \ "RevLvl").read[Int]
      revdlvl <- (__ \ "RevDLvl").read[Int]
    } yield INPUT_FX3(filtyp,filrat,fildep,filreso,filcut,filstprat,phrat,phdep,phreso,phstprat,phlvl,flrat,fldep,flreso,flstprat,fllvl,synfreq,synreso,syndecay,synbal,lofidep,lofismpl,lofibal,rmfreq,rmbal,gtob,sgsens,sgristim,sglvl,trans,pbpit,pbbnd,robonote,robogen,distdist,distton,distlvl,vococar,vocosens,vocoatck,vocobal,dynmtyp,dynmdynm,eqlo,eqlomd,eqhimd,eqhi,eqlvl,isobnd,isorat,isodep,isostprat,isolvl,octmod,octlvl,pantyp,panrat,pandep,panstprat,panpos,trrat,trdep,trlvl,slpat,slrat,sldep,dlytim,dlyfb,dlylvl,pandlytim,pandlyfb,pandlylvl,echrat,echint,echlvl,gratim,grafb,gralvl,rlltim,rllmod,rllfb,rlllvl,chorat,chodep,cholvl,revtim,revlvl,revdlvl)
  }}

case class TRACK_FX1 (
                       FilTyp: Int,
                       FilRat: Int,
                       FilDep: Int,
                       FilReso: Int,
                       FilCut: Int,
                       FilStpRat: Int,
                       PhRat: Int,
                       PhDep: Int,
                       PhReso: Int,
                       PhStpRat: Int,
                       PhLvl: Int,
                       FlRat: Int,
                       FlDep: Int,
                       FlReso: Int,
                       FlStpRat: Int,
                       FlLvl: Int,
                       SynFreq: Int,
                       SynReso: Int,
                       SynDecay: Int,
                       SynBal: Int,
                       LoFiDep: Int,
                       LoFiSmpl: Int,
                       LoFiBal: Int,
                       RmFreq: Int,
                       RmBal: Int,
                       GToB: Int,
                       SgSens: Int,
                       SgRisTim: Int,
                       SgLvl: Int,
                       Trans: Int,
                       PbPit: Int,
                       PbBnd: Int,
                       RoboNote: Int,
                       RoboGen: Int,
                       DistDist: Int,
                       DistTon: Int,
                       DistLvl: Int,
                       VocoCar: Int,
                       VocoSens: Int,
                       VocoAtck: Int,
                       VocoBal: Int,
                       DynmTyp: Int,
                       DynmDynm: Int,
                       EqLo: Int,
                       EqLoMd: Int,
                       EqHiMd: Int,
                       EqHi: Int,
                       EqLvl: Int,
                       IsoBnd: Int,
                       IsoRat: Int,
                       IsoDep: Int,
                       IsoStpRat: Int,
                       IsoLvl: Int,
                       OctMod: Int,
                       OctLvl: Int,
                       PanTyp: Int,
                       PanRat: Int,
                       PanDep: Int,
                       PanStpRat: Int,
                       PanPos: Int,
                       TrRat: Int,
                       TrDep: Int,
                       TrLvl: Int,
                       SlPat: Int,
                       SlRat: Int,
                       SlDep: Int,
                       DlyTim: Int,
                       DlyFb: Int,
                       DlyLvl: Int,
                       PanDlyTim: Int,
                       PanDlyFb: Int,
                       PanDlyLvl: Int,
                       EchRat: Int,
                       EchInt: Int,
                       EchLvl: Int,
                       GraTim: Int,
                       GraFb: Int,
                       GraLvl: Int,
                       RllTim: Int,
                       RllMod: Int,
                       RllFb: Int,
                       RllLvl: Int,
                       ChoRat: Int,
                       ChoDep: Int,
                       ChoLvl: Int,
                       RevTim: Int,
                       RevLvl: Int,
                       RevDLvl: Int
                     )

object TRACK_FX1{
  implicit val reader: XmlReader[TRACK_FX1] = {
    for {
      filtyp <- (__ \ "FilTyp").read[Int]
      filrat <- (__ \ "FilRat").read[Int]
      fildep <- (__ \ "FilDep").read[Int]
      filreso <- (__ \ "FilReso").read[Int]
      filcut <- (__ \ "FilCut").read[Int]
      filstprat <- (__ \ "FilStpRat").read[Int]
      phrat <- (__ \ "PhRat").read[Int]
      phdep <- (__ \ "PhDep").read[Int]
      phreso <- (__ \ "PhReso").read[Int]
      phstprat <- (__ \ "PhStpRat").read[Int]
      phlvl <- (__ \ "PhLvl").read[Int]
      flrat <- (__ \ "FlRat").read[Int]
      fldep <- (__ \ "FlDep").read[Int]
      flreso <- (__ \ "FlReso").read[Int]
      flstprat <- (__ \ "FlStpRat").read[Int]
      fllvl <- (__ \ "FlLvl").read[Int]
      synfreq <- (__ \ "SynFreq").read[Int]
      synreso <- (__ \ "SynReso").read[Int]
      syndecay <- (__ \ "SynDecay").read[Int]
      synbal <- (__ \ "SynBal").read[Int]
      lofidep <- (__ \ "LoFiDep").read[Int]
      lofismpl <- (__ \ "LoFiSmpl").read[Int]
      lofibal <- (__ \ "LoFiBal").read[Int]
      rmfreq <- (__ \ "RmFreq").read[Int]
      rmbal <- (__ \ "RmBal").read[Int]
      gtob <- (__ \ "GToB").read[Int]
      sgsens <- (__ \ "SgSens").read[Int]
      sgristim <- (__ \ "SgRisTim").read[Int]
      sglvl <- (__ \ "SgLvl").read[Int]
      trans <- (__ \ "Trans").read[Int]
      pbpit <- (__ \ "PbPit").read[Int]
      pbbnd <- (__ \ "PbBnd").read[Int]
      robonote <- (__ \ "RoboNote").read[Int]
      robogen <- (__ \ "RoboGen").read[Int]
      distdist <- (__ \ "DistDist").read[Int]
      distton <- (__ \ "DistTon").read[Int]
      distlvl <- (__ \ "DistLvl").read[Int]
      vococar <- (__ \ "VocoCar").read[Int]
      vocosens <- (__ \ "VocoSens").read[Int]
      vocoatck <- (__ \ "VocoAtck").read[Int]
      vocobal <- (__ \ "VocoBal").read[Int]
      dynmtyp <- (__ \ "DynmTyp").read[Int]
      dynmdynm <- (__ \ "DynmDynm").read[Int]
      eqlo <- (__ \ "EqLo").read[Int]
      eqlomd <- (__ \ "EqLoMd").read[Int]
      eqhimd <- (__ \ "EqHiMd").read[Int]
      eqhi <- (__ \ "EqHi").read[Int]
      eqlvl <- (__ \ "EqLvl").read[Int]
      isobnd <- (__ \ "IsoBnd").read[Int]
      isorat <- (__ \ "IsoRat").read[Int]
      isodep <- (__ \ "IsoDep").read[Int]
      isostprat <- (__ \ "IsoStpRat").read[Int]
      isolvl <- (__ \ "IsoLvl").read[Int]
      octmod <- (__ \ "OctMod").read[Int]
      octlvl <- (__ \ "OctLvl").read[Int]
      pantyp <- (__ \ "PanTyp").read[Int]
      panrat <- (__ \ "PanRat").read[Int]
      pandep <- (__ \ "PanDep").read[Int]
      panstprat <- (__ \ "PanStpRat").read[Int]
      panpos <- (__ \ "PanPos").read[Int]
      trrat <- (__ \ "TrRat").read[Int]
      trdep <- (__ \ "TrDep").read[Int]
      trlvl <- (__ \ "TrLvl").read[Int]
      slpat <- (__ \ "SlPat").read[Int]
      slrat <- (__ \ "SlRat").read[Int]
      sldep <- (__ \ "SlDep").read[Int]
      dlytim <- (__ \ "DlyTim").read[Int]
      dlyfb <- (__ \ "DlyFb").read[Int]
      dlylvl <- (__ \ "DlyLvl").read[Int]
      pandlytim <- (__ \ "PanDlyTim").read[Int]
      pandlyfb <- (__ \ "PanDlyFb").read[Int]
      pandlylvl <- (__ \ "PanDlyLvl").read[Int]
      echrat <- (__ \ "EchRat").read[Int]
      echint <- (__ \ "EchInt").read[Int]
      echlvl <- (__ \ "EchLvl").read[Int]
      gratim <- (__ \ "GraTim").read[Int]
      grafb <- (__ \ "GraFb").read[Int]
      gralvl <- (__ \ "GraLvl").read[Int]
      rlltim <- (__ \ "RllTim").read[Int]
      rllmod <- (__ \ "RllMod").read[Int]
      rllfb <- (__ \ "RllFb").read[Int]
      rlllvl <- (__ \ "RllLvl").read[Int]
      chorat <- (__ \ "ChoRat").read[Int]
      chodep <- (__ \ "ChoDep").read[Int]
      cholvl <- (__ \ "ChoLvl").read[Int]
      revtim <- (__ \ "RevTim").read[Int]
      revlvl <- (__ \ "RevLvl").read[Int]
      revdlvl <- (__ \ "RevDLvl").read[Int]
    } yield TRACK_FX1(filtyp,filrat,fildep,filreso,filcut,filstprat,phrat,phdep,phreso,phstprat,phlvl,flrat,fldep,flreso,flstprat,fllvl,synfreq,synreso,syndecay,synbal,lofidep,lofismpl,lofibal,rmfreq,rmbal,gtob,sgsens,sgristim,sglvl,trans,pbpit,pbbnd,robonote,robogen,distdist,distton,distlvl,vococar,vocosens,vocoatck,vocobal,dynmtyp,dynmdynm,eqlo,eqlomd,eqhimd,eqhi,eqlvl,isobnd,isorat,isodep,isostprat,isolvl,octmod,octlvl,pantyp,panrat,pandep,panstprat,panpos,trrat,trdep,trlvl,slpat,slrat,sldep,dlytim,dlyfb,dlylvl,pandlytim,pandlyfb,pandlylvl,echrat,echint,echlvl,gratim,grafb,gralvl,rlltim,rllmod,rllfb,rlllvl,chorat,chodep,cholvl,revtim,revlvl,revdlvl)
  }}

case class TRACK_FX2 (
                       FilTyp: Int,
                       FilRat: Int,
                       FilDep: Int,
                       FilReso: Int,
                       FilCut: Int,
                       FilStpRat: Int,
                       PhRat: Int,
                       PhDep: Int,
                       PhReso: Int,
                       PhStpRat: Int,
                       PhLvl: Int,
                       FlRat: Int,
                       FlDep: Int,
                       FlReso: Int,
                       FlStpRat: Int,
                       FlLvl: Int,
                       SynFreq: Int,
                       SynReso: Int,
                       SynDecay: Int,
                       SynBal: Int,
                       LoFiDep: Int,
                       LoFiSmpl: Int,
                       LoFiBal: Int,
                       RmFreq: Int,
                       RmBal: Int,
                       GToB: Int,
                       SgSens: Int,
                       SgRisTim: Int,
                       SgLvl: Int,
                       Trans: Int,
                       PbPit: Int,
                       PbBnd: Int,
                       RoboNote: Int,
                       RoboGen: Int,
                       DistDist: Int,
                       DistTon: Int,
                       DistLvl: Int,
                       VocoCar: Int,
                       VocoSens: Int,
                       VocoAtck: Int,
                       VocoBal: Int,
                       DynmTyp: Int,
                       DynmDynm: Int,
                       EqLo: Int,
                       EqLoMd: Int,
                       EqHiMd: Int,
                       EqHi: Int,
                       EqLvl: Int,
                       IsoBnd: Int,
                       IsoRat: Int,
                       IsoDep: Int,
                       IsoStpRat: Int,
                       IsoLvl: Int,
                       OctMod: Int,
                       OctLvl: Int,
                       PanTyp: Int,
                       PanRat: Int,
                       PanDep: Int,
                       PanStpRat: Int,
                       PanPos: Int,
                       TrRat: Int,
                       TrDep: Int,
                       TrLvl: Int,
                       SlPat: Int,
                       SlRat: Int,
                       SlDep: Int,
                       DlyTim: Int,
                       DlyFb: Int,
                       DlyLvl: Int,
                       PanDlyTim: Int,
                       PanDlyFb: Int,
                       PanDlyLvl: Int,
                       EchRat: Int,
                       EchInt: Int,
                       EchLvl: Int,
                       GraTim: Int,
                       GraFb: Int,
                       GraLvl: Int,
                       RllTim: Int,
                       RllMod: Int,
                       RllFb: Int,
                       RllLvl: Int,
                       ChoRat: Int,
                       ChoDep: Int,
                       ChoLvl: Int,
                       RevTim: Int,
                       RevLvl: Int,
                       RevDLvl: Int
                     )

object TRACK_FX2{
  implicit val reader: XmlReader[TRACK_FX2] = {
    for {
      filtyp <- (__ \ "FilTyp").read[Int]
      filrat <- (__ \ "FilRat").read[Int]
      fildep <- (__ \ "FilDep").read[Int]
      filreso <- (__ \ "FilReso").read[Int]
      filcut <- (__ \ "FilCut").read[Int]
      filstprat <- (__ \ "FilStpRat").read[Int]
      phrat <- (__ \ "PhRat").read[Int]
      phdep <- (__ \ "PhDep").read[Int]
      phreso <- (__ \ "PhReso").read[Int]
      phstprat <- (__ \ "PhStpRat").read[Int]
      phlvl <- (__ \ "PhLvl").read[Int]
      flrat <- (__ \ "FlRat").read[Int]
      fldep <- (__ \ "FlDep").read[Int]
      flreso <- (__ \ "FlReso").read[Int]
      flstprat <- (__ \ "FlStpRat").read[Int]
      fllvl <- (__ \ "FlLvl").read[Int]
      synfreq <- (__ \ "SynFreq").read[Int]
      synreso <- (__ \ "SynReso").read[Int]
      syndecay <- (__ \ "SynDecay").read[Int]
      synbal <- (__ \ "SynBal").read[Int]
      lofidep <- (__ \ "LoFiDep").read[Int]
      lofismpl <- (__ \ "LoFiSmpl").read[Int]
      lofibal <- (__ \ "LoFiBal").read[Int]
      rmfreq <- (__ \ "RmFreq").read[Int]
      rmbal <- (__ \ "RmBal").read[Int]
      gtob <- (__ \ "GToB").read[Int]
      sgsens <- (__ \ "SgSens").read[Int]
      sgristim <- (__ \ "SgRisTim").read[Int]
      sglvl <- (__ \ "SgLvl").read[Int]
      trans <- (__ \ "Trans").read[Int]
      pbpit <- (__ \ "PbPit").read[Int]
      pbbnd <- (__ \ "PbBnd").read[Int]
      robonote <- (__ \ "RoboNote").read[Int]
      robogen <- (__ \ "RoboGen").read[Int]
      distdist <- (__ \ "DistDist").read[Int]
      distton <- (__ \ "DistTon").read[Int]
      distlvl <- (__ \ "DistLvl").read[Int]
      vococar <- (__ \ "VocoCar").read[Int]
      vocosens <- (__ \ "VocoSens").read[Int]
      vocoatck <- (__ \ "VocoAtck").read[Int]
      vocobal <- (__ \ "VocoBal").read[Int]
      dynmtyp <- (__ \ "DynmTyp").read[Int]
      dynmdynm <- (__ \ "DynmDynm").read[Int]
      eqlo <- (__ \ "EqLo").read[Int]
      eqlomd <- (__ \ "EqLoMd").read[Int]
      eqhimd <- (__ \ "EqHiMd").read[Int]
      eqhi <- (__ \ "EqHi").read[Int]
      eqlvl <- (__ \ "EqLvl").read[Int]
      isobnd <- (__ \ "IsoBnd").read[Int]
      isorat <- (__ \ "IsoRat").read[Int]
      isodep <- (__ \ "IsoDep").read[Int]
      isostprat <- (__ \ "IsoStpRat").read[Int]
      isolvl <- (__ \ "IsoLvl").read[Int]
      octmod <- (__ \ "OctMod").read[Int]
      octlvl <- (__ \ "OctLvl").read[Int]
      pantyp <- (__ \ "PanTyp").read[Int]
      panrat <- (__ \ "PanRat").read[Int]
      pandep <- (__ \ "PanDep").read[Int]
      panstprat <- (__ \ "PanStpRat").read[Int]
      panpos <- (__ \ "PanPos").read[Int]
      trrat <- (__ \ "TrRat").read[Int]
      trdep <- (__ \ "TrDep").read[Int]
      trlvl <- (__ \ "TrLvl").read[Int]
      slpat <- (__ \ "SlPat").read[Int]
      slrat <- (__ \ "SlRat").read[Int]
      sldep <- (__ \ "SlDep").read[Int]
      dlytim <- (__ \ "DlyTim").read[Int]
      dlyfb <- (__ \ "DlyFb").read[Int]
      dlylvl <- (__ \ "DlyLvl").read[Int]
      pandlytim <- (__ \ "PanDlyTim").read[Int]
      pandlyfb <- (__ \ "PanDlyFb").read[Int]
      pandlylvl <- (__ \ "PanDlyLvl").read[Int]
      echrat <- (__ \ "EchRat").read[Int]
      echint <- (__ \ "EchInt").read[Int]
      echlvl <- (__ \ "EchLvl").read[Int]
      gratim <- (__ \ "GraTim").read[Int]
      grafb <- (__ \ "GraFb").read[Int]
      gralvl <- (__ \ "GraLvl").read[Int]
      rlltim <- (__ \ "RllTim").read[Int]
      rllmod <- (__ \ "RllMod").read[Int]
      rllfb <- (__ \ "RllFb").read[Int]
      rlllvl <- (__ \ "RllLvl").read[Int]
      chorat <- (__ \ "ChoRat").read[Int]
      chodep <- (__ \ "ChoDep").read[Int]
      cholvl <- (__ \ "ChoLvl").read[Int]
      revtim <- (__ \ "RevTim").read[Int]
      revlvl <- (__ \ "RevLvl").read[Int]
      revdlvl <- (__ \ "RevDLvl").read[Int]
    } yield TRACK_FX2(filtyp,filrat,fildep,filreso,filcut,filstprat,phrat,phdep,phreso,phstprat,phlvl,flrat,fldep,flreso,flstprat,fllvl,synfreq,synreso,syndecay,synbal,lofidep,lofismpl,lofibal,rmfreq,rmbal,gtob,sgsens,sgristim,sglvl,trans,pbpit,pbbnd,robonote,robogen,distdist,distton,distlvl,vococar,vocosens,vocoatck,vocobal,dynmtyp,dynmdynm,eqlo,eqlomd,eqhimd,eqhi,eqlvl,isobnd,isorat,isodep,isostprat,isolvl,octmod,octlvl,pantyp,panrat,pandep,panstprat,panpos,trrat,trdep,trlvl,slpat,slrat,sldep,dlytim,dlyfb,dlylvl,pandlytim,pandlyfb,pandlylvl,echrat,echint,echlvl,gratim,grafb,gralvl,rlltim,rllmod,rllfb,rlllvl,chorat,chodep,cholvl,revtim,revlvl,revdlvl)
  }}

case class TRACK_FX3 (
                       FilTyp: Int,
                       FilRat: Int,
                       FilDep: Int,
                       FilReso: Int,
                       FilCut: Int,
                       FilStpRat: Int,
                       PhRat: Int,
                       PhDep: Int,
                       PhReso: Int,
                       PhStpRat: Int,
                       PhLvl: Int,
                       FlRat: Int,
                       FlDep: Int,
                       FlReso: Int,
                       FlStpRat: Int,
                       FlLvl: Int,
                       SynFreq: Int,
                       SynReso: Int,
                       SynDecay: Int,
                       SynBal: Int,
                       LoFiDep: Int,
                       LoFiSmpl: Int,
                       LoFiBal: Int,
                       RmFreq: Int,
                       RmBal: Int,
                       GToB: Int,
                       SgSens: Int,
                       SgRisTim: Int,
                       SgLvl: Int,
                       Trans: Int,
                       PbPit: Int,
                       PbBnd: Int,
                       RoboNote: Int,
                       RoboGen: Int,
                       DistDist: Int,
                       DistTon: Int,
                       DistLvl: Int,
                       VocoCar: Int,
                       VocoSens: Int,
                       VocoAtck: Int,
                       VocoBal: Int,
                       DynmTyp: Int,
                       DynmDynm: Int,
                       EqLo: Int,
                       EqLoMd: Int,
                       EqHiMd: Int,
                       EqHi: Int,
                       EqLvl: Int,
                       IsoBnd: Int,
                       IsoRat: Int,
                       IsoDep: Int,
                       IsoStpRat: Int,
                       IsoLvl: Int,
                       OctMod: Int,
                       OctLvl: Int,
                       PanTyp: Int,
                       PanRat: Int,
                       PanDep: Int,
                       PanStpRat: Int,
                       PanPos: Int,
                       TrRat: Int,
                       TrDep: Int,
                       TrLvl: Int,
                       SlPat: Int,
                       SlRat: Int,
                       SlDep: Int,
                       DlyTim: Int,
                       DlyFb: Int,
                       DlyLvl: Int,
                       PanDlyTim: Int,
                       PanDlyFb: Int,
                       PanDlyLvl: Int,
                       EchRat: Int,
                       EchInt: Int,
                       EchLvl: Int,
                       GraTim: Int,
                       GraFb: Int,
                       GraLvl: Int,
                       RllTim: Int,
                       RllMod: Int,
                       RllFb: Int,
                       RllLvl: Int,
                       ChoRat: Int,
                       ChoDep: Int,
                       ChoLvl: Int,
                       RevTim: Int,
                       RevLvl: Int,
                       RevDLvl: Int
                     )

object TRACK_FX3{
  implicit val reader: XmlReader[TRACK_FX3] = {
    for {
      filtyp <- (__ \ "FilTyp").read[Int]
      filrat <- (__ \ "FilRat").read[Int]
      fildep <- (__ \ "FilDep").read[Int]
      filreso <- (__ \ "FilReso").read[Int]
      filcut <- (__ \ "FilCut").read[Int]
      filstprat <- (__ \ "FilStpRat").read[Int]
      phrat <- (__ \ "PhRat").read[Int]
      phdep <- (__ \ "PhDep").read[Int]
      phreso <- (__ \ "PhReso").read[Int]
      phstprat <- (__ \ "PhStpRat").read[Int]
      phlvl <- (__ \ "PhLvl").read[Int]
      flrat <- (__ \ "FlRat").read[Int]
      fldep <- (__ \ "FlDep").read[Int]
      flreso <- (__ \ "FlReso").read[Int]
      flstprat <- (__ \ "FlStpRat").read[Int]
      fllvl <- (__ \ "FlLvl").read[Int]
      synfreq <- (__ \ "SynFreq").read[Int]
      synreso <- (__ \ "SynReso").read[Int]
      syndecay <- (__ \ "SynDecay").read[Int]
      synbal <- (__ \ "SynBal").read[Int]
      lofidep <- (__ \ "LoFiDep").read[Int]
      lofismpl <- (__ \ "LoFiSmpl").read[Int]
      lofibal <- (__ \ "LoFiBal").read[Int]
      rmfreq <- (__ \ "RmFreq").read[Int]
      rmbal <- (__ \ "RmBal").read[Int]
      gtob <- (__ \ "GToB").read[Int]
      sgsens <- (__ \ "SgSens").read[Int]
      sgristim <- (__ \ "SgRisTim").read[Int]
      sglvl <- (__ \ "SgLvl").read[Int]
      trans <- (__ \ "Trans").read[Int]
      pbpit <- (__ \ "PbPit").read[Int]
      pbbnd <- (__ \ "PbBnd").read[Int]
      robonote <- (__ \ "RoboNote").read[Int]
      robogen <- (__ \ "RoboGen").read[Int]
      distdist <- (__ \ "DistDist").read[Int]
      distton <- (__ \ "DistTon").read[Int]
      distlvl <- (__ \ "DistLvl").read[Int]
      vococar <- (__ \ "VocoCar").read[Int]
      vocosens <- (__ \ "VocoSens").read[Int]
      vocoatck <- (__ \ "VocoAtck").read[Int]
      vocobal <- (__ \ "VocoBal").read[Int]
      dynmtyp <- (__ \ "DynmTyp").read[Int]
      dynmdynm <- (__ \ "DynmDynm").read[Int]
      eqlo <- (__ \ "EqLo").read[Int]
      eqlomd <- (__ \ "EqLoMd").read[Int]
      eqhimd <- (__ \ "EqHiMd").read[Int]
      eqhi <- (__ \ "EqHi").read[Int]
      eqlvl <- (__ \ "EqLvl").read[Int]
      isobnd <- (__ \ "IsoBnd").read[Int]
      isorat <- (__ \ "IsoRat").read[Int]
      isodep <- (__ \ "IsoDep").read[Int]
      isostprat <- (__ \ "IsoStpRat").read[Int]
      isolvl <- (__ \ "IsoLvl").read[Int]
      octmod <- (__ \ "OctMod").read[Int]
      octlvl <- (__ \ "OctLvl").read[Int]
      pantyp <- (__ \ "PanTyp").read[Int]
      panrat <- (__ \ "PanRat").read[Int]
      pandep <- (__ \ "PanDep").read[Int]
      panstprat <- (__ \ "PanStpRat").read[Int]
      panpos <- (__ \ "PanPos").read[Int]
      trrat <- (__ \ "TrRat").read[Int]
      trdep <- (__ \ "TrDep").read[Int]
      trlvl <- (__ \ "TrLvl").read[Int]
      slpat <- (__ \ "SlPat").read[Int]
      slrat <- (__ \ "SlRat").read[Int]
      sldep <- (__ \ "SlDep").read[Int]
      dlytim <- (__ \ "DlyTim").read[Int]
      dlyfb <- (__ \ "DlyFb").read[Int]
      dlylvl <- (__ \ "DlyLvl").read[Int]
      pandlytim <- (__ \ "PanDlyTim").read[Int]
      pandlyfb <- (__ \ "PanDlyFb").read[Int]
      pandlylvl <- (__ \ "PanDlyLvl").read[Int]
      echrat <- (__ \ "EchRat").read[Int]
      echint <- (__ \ "EchInt").read[Int]
      echlvl <- (__ \ "EchLvl").read[Int]
      gratim <- (__ \ "GraTim").read[Int]
      grafb <- (__ \ "GraFb").read[Int]
      gralvl <- (__ \ "GraLvl").read[Int]
      rlltim <- (__ \ "RllTim").read[Int]
      rllmod <- (__ \ "RllMod").read[Int]
      rllfb <- (__ \ "RllFb").read[Int]
      rlllvl <- (__ \ "RllLvl").read[Int]
      chorat <- (__ \ "ChoRat").read[Int]
      chodep <- (__ \ "ChoDep").read[Int]
      cholvl <- (__ \ "ChoLvl").read[Int]
      revtim <- (__ \ "RevTim").read[Int]
      revlvl <- (__ \ "RevLvl").read[Int]
      revdlvl <- (__ \ "RevDLvl").read[Int]
    } yield TRACK_FX3(filtyp,filrat,fildep,filreso,filcut,filstprat,phrat,phdep,phreso,phstprat,phlvl,flrat,fldep,flreso,flstprat,fllvl,synfreq,synreso,syndecay,synbal,lofidep,lofismpl,lofibal,rmfreq,rmbal,gtob,sgsens,sgristim,sglvl,trans,pbpit,pbbnd,robonote,robogen,distdist,distton,distlvl,vococar,vocosens,vocoatck,vocobal,dynmtyp,dynmdynm,eqlo,eqlomd,eqhimd,eqhi,eqlvl,isobnd,isorat,isodep,isostprat,isolvl,octmod,octlvl,pantyp,panrat,pandep,panstprat,panpos,trrat,trdep,trlvl,slpat,slrat,sldep,dlytim,dlyfb,dlylvl,pandlytim,pandlyfb,pandlylvl,echrat,echint,echlvl,gratim,grafb,gralvl,rlltim,rllmod,rllfb,rlllvl,chorat,chodep,cholvl,revtim,revlvl,revdlvl)
  }}