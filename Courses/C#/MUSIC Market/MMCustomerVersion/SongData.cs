//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace MMCustomerVersion
{
    using System;
    using System.Collections.Generic;
    
    public partial class SongData
    {
        public int Id { get; set; }
        public byte[] SongBytes { get; set; }
        public int SongId { get; set; }
    
        public virtual Song Song { get; set; }
    }
}
