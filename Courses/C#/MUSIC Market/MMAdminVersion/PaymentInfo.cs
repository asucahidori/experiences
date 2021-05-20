//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated from a template.
//
//     Manual changes to this file may cause unexpected behavior in your application.
//     Manual changes to this file will be overwritten if the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace MMAdminVersion
{
    using System;
    using System.Collections.Generic;
    
    public partial class PaymentInfo
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public PaymentInfo()
        {
            this.Transactions = new HashSet<Transaction>();
        }
    
        public int Id { get; set; }
        public string CardholderName { get; set; }
        public string ZipCode { get; set; }
        public System.DateTime ExpirationDate { get; set; }
        public int CardNumber { get; set; }
        public int CustomerId { get; set; }
    
        public virtual Customer Customer { get; set; }
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Transaction> Transactions { get; set; }
    }
}
