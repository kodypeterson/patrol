//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.automatorserver.contracts;

@kotlin.jvm.JvmName("-initializeempty")
inline fun empty(block: pl.leancode.automatorserver.contracts.EmptyKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.Empty =
  pl.leancode.automatorserver.contracts.EmptyKt.Dsl._create(pl.leancode.automatorserver.contracts.Contracts.Empty.newBuilder()).apply { block() }._build()
object EmptyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: pl.leancode.automatorserver.contracts.Contracts.Empty.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.automatorserver.contracts.Contracts.Empty.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.automatorserver.contracts.Contracts.Empty = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
inline fun pl.leancode.automatorserver.contracts.Contracts.Empty.copy(block: pl.leancode.automatorserver.contracts.EmptyKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.Empty =
  pl.leancode.automatorserver.contracts.EmptyKt.Dsl._create(this.toBuilder()).apply { block() }._build()

