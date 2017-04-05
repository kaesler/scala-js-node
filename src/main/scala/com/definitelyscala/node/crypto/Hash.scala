package com.definitelyscala.node.crypto

import scala.scalajs.js
import com.definitelyscala.node.{Buffer, ReadWriteStream}
import com.definitelyscala.node.NodeJS._
import com.definitelyscala.node.crypto.Crypto._

import scala.scalajs.js.|

@js.native
trait Hash extends ReadWriteStream {
  def update(data: String | Buffer): Hash = js.native
  def update(data: String | Buffer, input_encoding: Utf8AsciiLatin1Encoding): Hash = js.native
  def digest(): Buffer = js.native
  def digest(encoding: HexBase64Latin1Encoding): String = js.native
}
